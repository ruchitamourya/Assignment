import java.util.ArrayList;

/**
 * Created by ruchi on 17/07/2017.
 * A class which holds info of employee
 */
public class Employee extends Person {
    private int employeeId;
    private String blooGroup;
    private String designation;
    private Manager manager;

    //An employee can have many tasks
    private ArrayList<Task> tasks;

    // Employees are equal if there employeeId matches.
    @Override
    public boolean equals(Object employee) {
        if (this == employee) {
            return true;
        }
        if (employee instanceof Employee) {
            Employee anotherEmployee = (Employee) employee;
            if (this.employeeId == anotherEmployee.employeeId) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

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

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

}
