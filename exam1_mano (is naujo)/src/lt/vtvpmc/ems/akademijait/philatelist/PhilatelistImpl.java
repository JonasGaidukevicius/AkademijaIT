package lt.vtvpmc.ems.akademijait.philatelist;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhilatelistImpl implements Philatelist {

    private List<PostStamp> postStampList = new ArrayList<>();


    @Override
    public void addToCollection(PostStamp postStamp) {
        if(postStamp == null || postStamp.getName() == null || postStamp.getName().equals("")){
            throw new IllegalArgumentException("Paduotas neteisingas pasto zenklas");
        }

        boolean alreadyIsInCollection = false;

        if(this.postStampList != null){
            alreadyIsInCollection = this.postStampList.contains(postStamp);
        }


       if(!alreadyIsInCollection){
            this.postStampList.add(postStamp);
        }

    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {
        if(this.postStampList == null){
            throw new NullPointerException("Kolekcijoje nera nei vieno pasto zenklo");
        }
        PostStamp mostExpensivePostStamp =  Collections.max(this.postStampList, Comparator.comparing(ps -> ps.getMarketPrice()));
        //System.out.println("The most expensive post stamp is : " + mostExpensivePostStamp.getName());


        return mostExpensivePostStamp;
    }

    @Override
    public double getAveragePostStampPrice() {
        if(this.postStampList == null){
            throw new NullPointerException("Kolekcijoje nera nei vieno pasto zenklo");
        }
        double sumOfPostStampPrices = 0;
        int counter = 0;
        for (PostStamp currentPostStamp: this.postStampList) {
            sumOfPostStampPrices += currentPostStamp.getMarketPrice();
            counter++;
        }
        return sumOfPostStampPrices / counter;
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        if(this.postStampList == null){
            throw new NullPointerException("Kolekcijoje nera nei vieno pasto zenklo");
        }
        int counter = this.postStampList.size();

        return counter;
    }
}
