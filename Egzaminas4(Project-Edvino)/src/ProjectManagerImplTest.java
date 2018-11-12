import lt.itakademija.exam.Project;
import org.junit.Assert;
import org.junit.Test;
;



import static org.junit.jupiter.api.Assertions.*;

class ProjectManagerImplTest {

    @Test
    public void shouldCreateAProject () {

        ProjectManagerImpl projectManager = new ProjectManagerImpl();
        projectManager.createProject("1", "Summary1");

        Project project = new Project("1", "Summary1");

        Assert.assertEquals(project, projectManager.createProject("1", "Summary1..."));





    }


}