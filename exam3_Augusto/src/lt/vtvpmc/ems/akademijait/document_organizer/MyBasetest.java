package lt.vtvpmc.ems.akademijait.document_organizer;

import lt.itakademija.*;

import java.util.Iterator;

public class MyBasetest extends BaseTest {

    @Override
    protected DocumentOrganizer createDocumentOrganizer(DocumentTypeDetector documentTypeDetector) {
        return new DocOrganizer(documentTypeDetector);
    }

    @Override
    protected DocumentProducer createDocumentProducer(Iterator<Document> iterator) {
        return new DocumentProducerImplementation(iterator);
    }

    @Override
    protected DocumentConsumer createDocumentConsumer(FileRepository fileRepository) {
        return new DocumentConsumerImplementation(fileRepository);
    }
}
