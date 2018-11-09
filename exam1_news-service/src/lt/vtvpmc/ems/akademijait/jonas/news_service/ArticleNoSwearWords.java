package lt.vtvpmc.ems.akademijait.jonas.news_service;

import lt.vtvpmc.Article;

public class ArticleNoSwearWords implements Article {

    private

    private final String heading;
    private final String brief;

    ArticleNoSwearWords(String heading, String brief) {
        this.heading = heading;
        this.brief = brief;
    }

    @Override
    public String getHeading() {

        return null;
    }

    @Override
    public String getBrief() {
        return null;
    }
}
