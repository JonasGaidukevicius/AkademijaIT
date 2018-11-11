package lt.vtvpmc.ems.akademijait.jonas.document_organizer;

import lt.itakademija.Document;
import lt.itakademija.DocumentConsumer;
import lt.itakademija.FileRepository;

public class DocumentConsumerImpl implements DocumentConsumer {
    private FileRepository fileRepository;

    public DocumentConsumerImpl (FileRepository fileRepository){
        this.fileRepository = fileRepository;
    }

    @Override
    public void consumeSpam(Document document) {
        if(document != null) {
            fileRepository.putSpam(document);
        }
    }

    @Override
    public void consumeImportant(Document document) {
        if(document != null) {
            fileRepository.putImportant(document);
        }
    }

    @Override
    public void consumeOrdinary(Document document) {
        if(document != null) {
            fileRepository.putOrdinary(document);
        }
    }
}
