package lt.vtvpmc.ems.akademijait.news;

import lt.vtvpmc.Article;

public class SafeArticle implements Article {

    public String heading;
    public String brief;

    public SafeArticle(String heading, String brief) {
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