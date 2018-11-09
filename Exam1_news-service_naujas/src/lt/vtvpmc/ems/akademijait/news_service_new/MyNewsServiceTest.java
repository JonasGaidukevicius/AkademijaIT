package lt.vtvpmc.ems.akademijait.news_service_new;

import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;

public class MyNewsServiceTest extends BaseNewsServiceTest {

    @org.junit.Test
    public void getArticles(){

    }


    @Override
    protected NewsService getNewsService() {
        return new MyNewsService();
    }
}
