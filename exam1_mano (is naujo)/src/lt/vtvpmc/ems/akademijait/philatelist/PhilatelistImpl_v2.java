package lt.vtvpmc.ems.akademijait.philatelist;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.*;

public class PhilatelistImpl_v2 implements Philatelist {

    private Set<PostStamp> postStampList = new HashSet<>();


    @Override
    public void addToCollection(PostStamp postStamp) {
        if(postStamp == null || postStamp.getName() == null || postStamp.getName().equals("")){
            throw new IllegalArgumentException("Paduotas neteisingas pasto zenklas");
        }

        //boolean alreadyIsInCollection = false;

        /*if(this.postStampList != null){
            alreadyIsInCollection = this.postStampList.contains(postStamp);
        }

       if(alreadyIsInCollection){
            throw new IllegalArgumentException("Toks pasto zenklas jau yra");
        } else{
            this.postStampList.add(postStamp);
        }*/

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
        System.out.println(this.postStampList.size());

        return counter;
    }
}
