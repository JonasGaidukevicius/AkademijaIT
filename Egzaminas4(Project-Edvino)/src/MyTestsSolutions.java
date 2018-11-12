import lt.itakademija.exam.ProjectManager;
import lt.itakademija.exam.test.BaseTest;

public class MyTestsSolutions extends BaseTest {
    @Override
    protected ProjectManager createProjectTracker() {
        return new ProjectManagerImpl();
    }
}
