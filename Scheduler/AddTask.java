package Scheduler;

public class AddTask extends DataBase{

    public static void AddTaskLow(DataBase d, TaskLow t){
        d.low.add(t);
    }

    public static void AddTaskMiddle(DataBase d, TaskMiddle t){
        d.middle.add(t);
    }

    public static void AddTaskHigh(DataBase d, TaskHigh t){
        d.high.add(t);
    }
}
