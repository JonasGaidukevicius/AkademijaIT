package lt.vtvpmc.ems.akademijait.news_service_new;

import lt.vtvpmc.Article;

public class SafeArticle implements Article {
    private String Heading = "";
    private String Brief = "";

    public SafeArticle(String heading, String brief) {
        Heading = heading;
        Brief = brief;
    }

    @Override
    public String getHeading() {
        return Heading;
    }

    @Override
    public String getBrief() {
        return Brief;
    }
}
