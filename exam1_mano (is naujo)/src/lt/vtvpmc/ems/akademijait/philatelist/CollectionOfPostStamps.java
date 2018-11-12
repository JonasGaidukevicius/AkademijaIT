package lt.vtvpmc.ems.akademijait.philatelist;

import philatelist.Philatelist;
import philatelist.PostStamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionOfPostStamps implements Philatelist {
    private ArrayList<PostStamp> listOfPostStamps = new ArrayList<PostStamp>();



    public void printAll(){
        for(int i = 0; i < this.listOfPostStamps.size(); i++){
            System.out.println(this.listOfPostStamps.get(i));
        }
    }

    @Override
    public void addToCollection(PostStamp postStamp) throws IllegalArgumentException {
        boolean alreadyIsInCollection = false;
        boolean isItEmpty = false;
        alreadyIsInCollection  = this.listOfPostStamps.contains(postStamp);
        if(postStamp.getName() == ""){
            isItEmpty = true;
        }
        //System.out.println("Ar yra toks - " + alreadyIsInCollection);
        if(alreadyIsInCollection){
            throw new IllegalArgumentException("Toks pasto zenklas jau yra");
        } else if (isItEmpty){
            throw new IllegalArgumentException("Negali nebuti pavadinimo");
        } else{
            this.listOfPostStamps.add(postStamp);
        }
    }

    @Override
    public PostStamp getTheMostExpensivePostStamByMarketValue() {

        PostStamp mostExpensivePostStamp =  Collections.max(this.listOfPostStamps, Comparator.comparing(ps -> ps.getMarketPrice()));
        System.out.println("The most expensive post stamp is : " + mostExpensivePostStamp.getName());


        return mostExpensivePostStamp;
    }

    @Override
    public double getAveragePostStampPrice() {
        return 0;
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return 0;
    }
}
