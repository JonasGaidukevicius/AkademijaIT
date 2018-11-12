package lt.vtvpmc.ems.akademijait.jonas.exam4v1;

import lt.itakademija.exam.ProjectManager;
import lt.itakademija.exam.test.BaseTest;

public class MyBaseTest extends BaseTest {


    private ProjectManager sut;

    @Override
    protected ProjectManager createProjectTracker() {

        return new ProjectManagerImpl();
    }
}
