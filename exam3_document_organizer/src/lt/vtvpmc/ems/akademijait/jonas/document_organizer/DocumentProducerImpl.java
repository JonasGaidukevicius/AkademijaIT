package lt.vtvpmc.ems.akademijait.jonas.document_organizer;

import lt.itakademija.Document;
import lt.itakademija.DocumentProducer;

import java.util.Iterator;

public class DocumentProducerImpl implements DocumentProducer {


    private Iterator<Document> documentIterator;

    public DocumentProducerImpl(Iterator<Document> iterator){
        this.documentIterator = iterator;
    }


    @Override
    public Document get() {
        if(documentIterator.hasNext()){
            return documentIterator.next();
        }
        return null;
    }
}
