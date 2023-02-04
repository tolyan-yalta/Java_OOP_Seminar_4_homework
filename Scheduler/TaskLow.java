package Scheduler;

public class TaskLow extends Task{
    public String priority;

    TaskLow(int id){
        super.id = id;
        this.priority = "Low";
    }
}
