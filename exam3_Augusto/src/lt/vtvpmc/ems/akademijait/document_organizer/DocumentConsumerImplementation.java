package lt.vtvpmc.ems.akademijait.document_organizer;

import lt.itakademija.Document;
import lt.itakademija.DocumentConsumer;
import lt.itakademija.FileRepository;

public class DocumentConsumerImplementation implements DocumentConsumer {
    FileRepository fileRepository;

    public DocumentConsumerImplementation(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public void consumeSpam(Document document) throws IllegalArgumentException {
        checkForNull();
        fileRepository.putSpam(document);
    }

    private void checkForNull() {
    }

    @Override
    public void consumeImportant(Document document) {
        fileRepository.putImportant(document);
    }

    @Override
    public void consumeOrdinary(Document document) {
        fileRepository.putOrdinary(document);
    }
}
