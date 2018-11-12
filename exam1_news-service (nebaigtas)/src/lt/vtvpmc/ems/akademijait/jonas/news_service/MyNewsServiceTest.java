package lt.vtvpmc.ems.akademijait.jonas.news_service;

import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

public class MyNewsServiceTest extends BaseNewsServiceTest {

    @Override
    protected NewsService getNewsService() {
        return new NewsServiceImpl();
    }
}
