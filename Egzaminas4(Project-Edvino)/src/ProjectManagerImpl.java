import lt.itakademija.exam.Issue;
import lt.itakademija.exam.Project;
import lt.itakademija.exam.ProjectManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProjectManagerImpl implements ProjectManager {
    private final static Logger logger = LoggerFactory.getLogger(ProjectManagerImpl.class);

    private List<Project> projects = new ArrayList<>();

    @Override
    public Project createProject(String s, String s1) {
        if (s == null || s1 == null) {
            logger.info("Null values entered");
            throw new NullPointerException();

        } else if (s.equals("") || s1.equals("")) {
            logger.info("Empty values entered");
            throw new IllegalArgumentException();
        }

        Project project = new Project(s, s1);
        projects.add(project);

        return project;
    }

    @Override
    public Collection<Project> getProjects() {
        return projects;
    }

    @Override
    public Project getProjectById(String s) {
        Project foundProject = null;

        if (s == null) {
            throw new NullPointerException();
        } else if (s.equals("")) {
            throw new IllegalArgumentException();
        }

        for (Project project : projects) {
            if (project.getId().equals(s)) {
                foundProject = project;
            }
        }

        return foundProject;

    }

    @Override
    public Issue createIssue(Project project, String s) {
        if (project == null || s == null) {
            throw new NullPointerException();
        } else if (s == "" || project.equals("")) {
            throw new IllegalArgumentException();
        }
        Issue issue = new Issue(project, s);

        project.addIssue(issue);

        return issue;
    }

    @Override
    public Issue createIssue(String s, String s1) {
        Project foundProject = null;
        if (s == null || s1 == null) {
            throw new NullPointerException();
        } else if (s.equals("") || s1.equals("")) {
            throw new IllegalArgumentException();
        }
        for (Project project : projects) {
            if (project.getId().equals(s)) {
                foundProject = project;
            }
        }

        Issue issue = new Issue(foundProject, s1);

        foundProject.addIssue(issue);

        return issue;
    }

    @Override
    public Collection<Issue> getIssues(Project project) {
        if (project == null) {
            throw new NullPointerException();
        } else if (project.equals("")) {
            throw new IllegalArgumentException();
        }

        return project.getIssues();
    }

    @Override
    public Collection<Issue> getIssues(String s) {
        Project foundProject = null;
        if (s == null) {
            throw new NullPointerException();
        } else if (s.equals("")) {
            throw new IllegalArgumentException();
        }

        for (Project project : projects) {
            if (project.getId().equals(s)) {
                foundProject = project;
            }

        }
        return foundProject.getIssues();
    }
}

