package lt.vtvpmc.ems.akademijait.jonas.document_organizer;

import lt.itakademija.*;

import java.util.Iterator;

public class MyBaseTest extends BaseTest {

    @Override
    protected DocumentOrganizer createDocumentOrganizer(DocumentTypeDetector documentTypeDetector) {
        return new DocumentOrganizerImpl(documentTypeDetector);
    }

    @Override
    protected DocumentProducer createDocumentProducer(Iterator<Document> iterator) {
        return new DocumentProducerImpl(iterator);
    }

    @Override
    protected DocumentConsumer createDocumentConsumer(FileRepository fileRepository) {
        return new DocumentConsumerImpl(fileRepository);
    }
}
