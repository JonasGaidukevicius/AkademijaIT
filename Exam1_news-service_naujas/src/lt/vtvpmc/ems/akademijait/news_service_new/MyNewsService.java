package lt.vtvpmc.ems.akademijait.news_service_new;

import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MyNewsService implements NewsService {
    private String[] profanities = {"rupūs miltai", "velniai rautų", "velnias", "velniais"};
    private String profaneRegex = "";

    public MyNewsService (){
        StringBuilder regex = new StringBuilder();
        regex.append("(?i)(");


        for (int i = 0; i < profanities.length; i++){
            if(i > 0){
                regex.append("|");
            }
            regex.append(profanities[i]);
        }
        regex.append(")");
        profaneRegex = regex.toString();

    }



    @Override
    public List<Article> getArticles() {
        List<Article> safeArticles = new ArrayList<Article>();


        for (int i = 0; i < NewsServiceImpl.articles.size(); i++){
            Article original = NewsServiceImpl.articles.get(i);
            if(hasProfanity(original.getHeading())) continue;

            String newBrief = "";
            if(hasProfanity(original.getBrief())){
                newBrief = sanitizeText(original.getBrief());
            } else {
                newBrief = original.getBrief();
            }
            safeArticles.add(new SafeArticle(original.getHeading(), newBrief));
        }

        for (Article laikinas: safeArticles) {
            System.out.println(laikinas.getHeading());
            System.out.println(laikinas.getBrief());
        }
        System.out.println(safeArticles.size());
        return safeArticles;
    }



    private boolean hasProfanity(String text) {
        return text.matches(".*" + profaneRegex + ".*");
    }

    private String sanitizeText(String text) {
        String result = text.replaceAll(profaneRegex, "***");
        return result;
    }
}
