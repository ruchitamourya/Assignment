/**
 * Created by ruchi on 18/07/2017.
 */
public class Task {
    private int taskId;
    private String description;
    private String state;

    public void setTaskId(int taskId){this.taskId = taskId;}
    public int getTaskId() {
        return taskId;
    }

    public void setDescription(String description){this.description = description;}
    public String getDescription(){
        return description;
    }

    public void setState(String state){this.state = state;}
    public String getState(){
        return state;
    }
}
