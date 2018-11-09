package lt.vtvpmc.ems.akademijait.news_service;

import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;

public class MyNewsServiceTest extends BaseNewsServiceTest {

    @Override
    protected NewsService getNewsService() {
        return new MyNewsService();
    }
}
