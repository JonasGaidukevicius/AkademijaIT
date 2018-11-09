package lt.vtvpmc.ems.akademijait.news_service;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;

import java.util.ArrayList;
import java.util.List;

public class MyNewsService implements NewsService {
    String [] badWords = {"rupūs miltai", "velniai rautų", "velnias", "velniais"};
    List<Article> goodArticleList = new ArrayList<>();
    List<Article> originalArticleList = new ArrayList<>();

    @Override
    public List<Article> getArticles() {


        return null;
    }
}
