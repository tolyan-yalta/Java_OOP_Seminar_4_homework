package Scheduler;

public class TaskHigh extends Task{
    public String priority;

    TaskHigh(int id){
        super.id = id;
        this.priority = "High";
    }
}
