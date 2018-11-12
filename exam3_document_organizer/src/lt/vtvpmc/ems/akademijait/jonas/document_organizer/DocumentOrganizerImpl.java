package lt.vtvpmc.ems.akademijait.jonas.document_organizer;

import lt.itakademija.*;

import java.util.ArrayList;
import java.util.List;

public class DocumentOrganizerImpl  implements DocumentOrganizer {

    private final DocumentTypeDetector documentTypeDetector;
    List<Document> listOfDocuments;

    public DocumentOrganizerImpl (DocumentTypeDetector documentTypeDetector){
        this.documentTypeDetector = documentTypeDetector;
        this.listOfDocuments = new ArrayList<>();
    }

    @Override
    public long getTotalCount() {
        if (listOfDocuments == null){
            throw new NullPointerException("There is no list of documents");
        }
        return (long) listOfDocuments.size();
    }

    @Override
    public long getTotalLinesCount() {
        if (listOfDocuments == null){
            throw new NullPointerException("There is no list of documents");
        }
        long numberOfLines = 0l;
        for (Document currentDocument: this.listOfDocuments) {
            numberOfLines += currentDocument.getLines().size();
        }

        return numberOfLines;
    }

    @Override
    public void organize(DocumentProducer documentProducer, DocumentConsumer documentConsumer) {

        try{
            documentProducer.equals(null);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }

        try{
            documentConsumer.equals(null);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }

        //nuskaitau dokumentus is paduoto documentProducer
        Document currentDocument;
        DocumentType typeOfCurrentDocument = null;
        boolean isThereADocument = true;

        while(isThereADocument){
            try{
                currentDocument = documentProducer.get();
                if(currentDocument == null){
                    break;
                }
            } catch (NullPointerException e){
                throw new IllegalArgumentException("There is null document");

            }

            typeOfCurrentDocument = documentTypeDetector.detect(currentDocument);

            if(typeOfCurrentDocument.equals(DocumentType.UNKNOWN)){
                throw new UnknownDocumentTypeException("This type of document is unknown");
            }
            //System.out.println("Dokumento tipas - " + typeOfCurrentDocument);

            if (typeOfCurrentDocument.equals(DocumentType.SPAM)){
                documentConsumer.consumeSpam(currentDocument);
            } else if(typeOfCurrentDocument.equals(DocumentType.IMPORTANT)){
                documentConsumer.consumeImportant(currentDocument);
            } else if(typeOfCurrentDocument.equals(DocumentType.ORDINARY)){
                documentConsumer.consumeOrdinary(currentDocument);
            }
            listOfDocuments.add(currentDocument);




        }








    }
}
