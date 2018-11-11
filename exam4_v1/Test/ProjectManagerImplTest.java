import lt.itakademija.exam.Project;
import lt.vtvpmc.ems.akademijait.jonas.exam4v1.ProjectManagerImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProjectManagerImplTest {

    @Test
    public void shouldCreateProject(){
        ProjectManagerImpl newprojectManagerImpl = new ProjectManagerImpl();
        Project testProject = new Project("Id1", "Test project");

        Assert.assertEquals(testProject, newprojectManagerImpl.createProject("Id1", "Test project"));

    }


}
