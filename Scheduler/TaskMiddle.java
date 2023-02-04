package Scheduler;

public class TaskMiddle extends Task{
    public String priority;

    TaskMiddle(int id){
        super.id = id;
        this.priority = "Middle";
    }
}
