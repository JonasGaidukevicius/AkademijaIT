package lt.vtvpmc.ems.akademijait.news_service;

import lt.vtvpmc.Article;

import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MyNewsService implements NewsService {
    String [] badWords = {"rupūs miltai", "velniai rautų", "velnias", "velniais", "Rupūs miltai", "Velniai rautų", "Velnias", "Velniais"};
    List<Article> goodArticleList = new ArrayList<>();
    List<Article> originalArticleList = new ArrayList<>();

    @Override
    public List<Article> getArticles() {
        boolean foundBadArticle = false;

        originalArticleList = NewsServiceImpl.articles;

        //Patikrinu antrastes ir straipsniu su keiksmazodziais Headeryje i sarasa netraukiu
        for (Article currentArticle: originalArticleList) {
            for(int i = 0; i < badWords.length; i++){
                if(currentArticle.getHeading().contains(badWords[i])){
                    foundBadArticle = true;
                    break;
                }
            }
            if(!foundBadArticle){

                //kai randu straipsni su gera antraste, turiu paziureti ar tinkamas yra tekstas. Netinkama pakeisti i ***
                String newBrief = currentArticle.getBrief();

                for(int i = 0; i < badWords.length; i++){
                    if(currentArticle.getBrief().contains(badWords[i])){
                        newBrief = newBrief.replaceAll(badWords[i], "***");
                    }
                }

                goodArticleList.add(new MyArticle(currentArticle.getHeading(), newBrief));
            }
            foundBadArticle = false;

        }
        return goodArticleList;
    }
}
