package Scheduler;

import java.util.ArrayList;

public class DataBase {
    public ArrayList<TaskLow> low;
    public ArrayList<TaskMiddle> middle;
    public ArrayList<TaskHigh> high;
    public Integer lastId;

    DataBase() {
        this.low = new ArrayList<>();
        this.middle = new ArrayList<>();
        this.high = new ArrayList<>();
        this.lastId = 0;
    }

    // Вывод в консоль заданий в порядке приоритета с удалением просроченных заданий
    public void ShowData(){
        for (int i = 0; i < high.size(); i++) {
            if (high.get(i).CheckDeadline(high.get(i))) {
                int index = high.indexOf(high.get(i));
                high.remove(index);
            } else{
                System.out.println(high.get(i).toString() + " Приоритет: High");
            }
        }
        for (int i = 0; i < middle.size(); i++) {
            if (middle.get(i).CheckDeadline(middle.get(i))) {
                int index = middle.indexOf(middle.get(i));
                middle.remove(index);
            } else {
                System.out.println(middle.get(i).toString() + " Приоритет: Middle");
            }
        }
        for (int i = 0; i < low.size(); i++) {
            if (low.get(i).CheckDeadline(low.get(i))) {
                int index = low.indexOf(low.get(i));
                low.remove(index);
            } else {
                System.out.println(low.get(i).toString() + " Приоритет: Low");
            }
        }
    }
}
