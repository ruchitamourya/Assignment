import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by ruchi on 19/07/2017.
 */
public class Manager {
    //Manager can have multiple projects.
    private ArrayList<Project> projectList;

    public void setProjectList(ArrayList<Project> projectList) {
        this.projectList = projectList;
    }

    public ArrayList<Project> getProjectList() {
        return projectList;
    }
}
