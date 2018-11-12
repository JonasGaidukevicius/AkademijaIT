package lt.vtvpmc.ems.akademijait.news_service;

import lt.vtvpmc.Article;

public class MyArticle implements Article {
    private String heading;
    private String brief;

    public MyArticle(String heading, String brief){
        this.heading = heading;
        this.brief = brief;
    }

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getBrief() {
        return brief;
    }
}
