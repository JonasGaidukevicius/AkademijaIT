package lt.vtvpmc.ems.akademijait.jonas.exam4v1;

import lt.itakademija.exam.Issue;
import lt.itakademija.exam.Project;
import lt.itakademija.exam.ProjectManager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectManagerImpl implements ProjectManager {

    List<Project> listOfProjects = new ArrayList<>();

    @Override
    public Project createProject(String s, String s1) {
        if(s == null || s1 == null){
            throw new NullPointerException("At least one of the arguments is null");
        } else if(s.equals("") || s1.equals("")){
            throw new IllegalArgumentException("String argument is empty");
        }
        Project newProject = new Project (s,s1);
        listOfProjects.add(newProject);
        return newProject;
    }


    @Override
    public Collection<Project> getProjects() {


        if (listOfProjects == null){
            throw new NullPointerException();
        }

        return this.listOfProjects;
    }

    @Override
    public Project getProjectById(String s) {
        Project resultProject = null;


        for (Project currentProject: listOfProjects) {
            if(currentProject.getId().equals(s)){
                resultProject = currentProject;
                break;
            }

        }

        return resultProject;
    }

    @Override
    public Issue createIssue(Project project, String s) {
        if(project == null || s == null ){
            throw new NullPointerException("At least one of the arguments is null");
        } else if (s.equals("")){
            throw new IllegalArgumentException("The string argument is empty");
        }
        Issue newIssue = new Issue(project, s);
        project.addIssue(newIssue);

        return newIssue;
    }

    @Override
    public Issue createIssue(String s, String s1) {

        if(s == null || s1 == null ){
            throw new NullPointerException("At least one of the arguments is null");
        } else if (s.equals("") || s1.equals("")){
            throw new IllegalArgumentException("The string argument is empty");
        }
        Project neededProject = this.getProjectById(s);
        System.out.println("Rastas projektas - " + neededProject.getId());
        Issue newIssue = new Issue(neededProject, s1);
        neededProject.addIssue(newIssue);

        return new Issue(neededProject, s1);
    }

    @Override
    public Collection<Issue> getIssues(Project project) {
        if(project == null){
            throw new NullPointerException("Provided argument is null");
        } else if (project.equals("")){
            throw new IllegalArgumentException("Provided argument is empty");

        }

        return project.getIssues();
    }


    @Override
    public Collection<Issue> getIssues(String s) {
        if (s == null){
            throw new NullPointerException("Provided argument is null");
        } else if(s.equals("")){
            throw new IllegalArgumentException("Provided argument is empty");
        }
        Project neededProject = getProjectById(s);

        return neededProject.getIssues();
    }
}
