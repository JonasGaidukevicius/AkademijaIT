package lt.vtvpmc.ems.akademijait.news;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class MyNewsService implements NewsService {
    public static List<Article> safeArticles = new ArrayList();
    public String regex = "(?i)(rupūs miltai|velniai rautų|velnias|velniais)";

    @Override
    public List<Article> getArticles() {
        for (int i = 0; i < NewsServiceImpl.articles.size(); i++) {
            Article original = NewsServiceImpl.articles.get(i);
            if (hasSwearWords(NewsServiceImpl.articles.get(i).getHeading())) {
                continue;
            }
            if (hasSwearWords(NewsServiceImpl.articles.get(i).getBrief())) {
                String newBrief = replaceSwearWords(NewsServiceImpl.articles.get(i).getBrief());
                Article safeArticle = new SafeArticle(NewsServiceImpl.articles.get(i).getHeading(), newBrief);
                safeArticles.add(safeArticle);
            } else {
                safeArticles.add(original);
            }
        }
        return safeArticles;
    }    public boolean hasSwearWords(String text) {
        return text.matches(".*" + regex + ".*");
    }    public String replaceSwearWords(String text) {
        String result = text.replaceAll(regex, "***");
        return result;
    }}
