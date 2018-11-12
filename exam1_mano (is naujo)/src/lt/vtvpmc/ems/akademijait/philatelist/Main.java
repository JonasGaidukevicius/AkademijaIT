package lt.vtvpmc.ems.akademijait.philatelist;

import philatelist.PostStamp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CollectionOfPostStamps myCollection = new CollectionOfPostStamps();
        try{
            myCollection.addToCollection(new PostStamp("Lakunai", 10.5, 13.5));
            myCollection.addToCollection(new PostStamp("Pinigai", 90.5, 15.5));
            myCollection.addToCollection(new PostStamp("Gerulis", 10.5, 15.5));

        } catch (IllegalArgumentException e){
            System.out.println(e);
        }

        myCollection.printAll();

        myCollection.getTheMostExpensivePostStamByMarketValue();




    }


}
