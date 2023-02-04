package Scheduler;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Integer id = 0;

        boolean cycle = true;
        while (cycle) {
            Scanner in = new Scanner(System.in);
            System.out.println(". ".repeat(15)+".");
            System.out.println("\t1 - Показать текущие задания");
            System.out.println("\t2 - Добавить задание с низким приоритетом");
            System.out.println("\t3 - Добавить задание с средним приоритетом");
            System.out.println("\t4 - Добавить задание с высоким приоритетом");
            System.out.println("\t5 - Выйти из программы");
            System.out.println(". ".repeat(15)+".");
            System.out.print("Выберите действие: ");
            int input = in.nextInt();
            switch (input) {
                case 1:
                    db.ShowData();
                    break;
                case 2:
                    TaskLow tl = new TaskLow(id);
                    AddTask.AddTaskLow(db, tl);
                    id += 1;
                    break;
                case 3:
                    TaskMiddle tm = new TaskMiddle(id);
                    AddTask.AddTaskMiddle(db, tm);
                    id += 1;
                    break;
                case 4:
                    TaskHigh th = new TaskHigh(id);
                    AddTask.AddTaskHigh(db, th);
                    id += 1;
                    break;
                case 5:
                    cycle = false;
                    break;
            }
        }
    }
}
