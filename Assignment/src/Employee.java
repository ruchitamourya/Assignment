import java.util.ArrayList;

/**
 * Created by ruchi on 17/07/2017.
 */
public class Employee extends Person {// A subclass Employee extends superclass Person
    // three fields of this class
    private int employeeId;
    private String blooGroup;
    private String designation;
    private Employee manager;
    private ArrayList<Task> tasks ;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setBlooGroup(String blooGroup) {
        this.blooGroup = blooGroup;
    }

    public String getBlooGroup() {
        return blooGroup;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setManager(Employee manager){
        this.manager = manager ;
    }

    public Employee getManager(){
        return manager;
    }

    public void setTasks(ArrayList<Task> tasks){
        this.tasks =tasks;
    }


}
