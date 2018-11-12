package lt.vtvpmc.ems.akademijait.document_organizer;

import lt.itakademija.*;

import java.util.ArrayList;
import java.util.List;

public class DocOrganizer implements DocumentOrganizer {
    DocumentTypeDetector documentTypeDetector = null;
    List<Document> documentList = new ArrayList<>();

    public DocOrganizer(DocumentTypeDetector documentTypeDetector) {
        this.documentTypeDetector = documentTypeDetector;
    }

    @Override

    public long getTotalCount() {
        System.out.println(documentList.size());
        System.out.println(documentList.toArray().toString());
        System.out.println(documentList.get(0).getLines());
        return (long) documentList.size();
    }

    @Override
    public long getTotalLinesCount() {
        long sum = 0l;
        for (Document document : documentList
        ) {
            sum += document.getLines().size();
        }
        return sum;
    }

    @Override
    public void organize(DocumentProducer documentProducer, DocumentConsumer documentConsumer) {
        // checking Document Consumer for validity
        try {
            documentConsumer.equals(null);
        } catch (  Exception e) {
            throw new IllegalArgumentException();
        }

        DocumentType type = null;
        Document storedDocument = null;
        int counterOfFilesProccesed = 0; // just for checking if this is the first file being processed
        while (true) { // runs until producer runs out of files
            try {
                storedDocument = documentProducer.get(); // store file
                if (storedDocument.equals(null)) {
                    break;  // there is no method how to check if producer is out of files,
                    //so the code runs until it producer runs out of files and then it catches error
                    // and breaks from while loop to exit the method
                }
            } catch (
                    Exception e) {
                if (counterOfFilesProccesed == 0) {  //if this is the first file and it is already empty - it means that not valid argument was passed
                    throw new IllegalArgumentException();
                }
                break;  // else program finishes by using break;
            }

            counterOfFilesProccesed++;

            // File identification and consumption, bellow checks what kind of file was sent by file producer
            type = documentTypeDetector.detect(storedDocument);
            if (type.equals(DocumentType.valueOf("SPAM"))) {
                System.out.println("cia Spamas");
                documentConsumer.consumeSpam(storedDocument);
                this.documentList.add(storedDocument);
            } else if (type.equals(DocumentType.valueOf("IMPORTANT"))) {
                System.out.println("cia IMPORTANT FILE");
                documentConsumer.consumeImportant(storedDocument);
                this.documentList.add(storedDocument);
            } else if (type.equals(DocumentType.valueOf("ORDINARY"))) {
                System.out.println("cia ORDINARY  FILE");
                documentConsumer.consumeOrdinary(storedDocument);
                this.documentList.add(storedDocument);
            } else if (type.equals(DocumentType.valueOf("UNKNOWN"))) {
                System.out.println("cia UNKNOWN   FILE");
                throw new UnknownDocumentTypeException("unknow document");
            }
        }
    }
}
