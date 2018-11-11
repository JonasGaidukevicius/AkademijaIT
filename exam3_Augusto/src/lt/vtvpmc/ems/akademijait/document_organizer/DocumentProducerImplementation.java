package lt.vtvpmc.ems.akademijait.document_organizer;

import lt.itakademija.Document;
import lt.itakademija.DocumentProducer;

import java.util.Iterator;

public class DocumentProducerImplementation implements DocumentProducer {
    Iterator<Document> iterator;

    public DocumentProducerImplementation(Iterator<Document> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Document get() {
        Document placeHolder = null;
        if (!this.iterator.hasNext()) {
            return null;
        }
        placeHolder = this.iterator.next();
        System.out.println(placeHolder);
        return placeHolder;
    }
}
