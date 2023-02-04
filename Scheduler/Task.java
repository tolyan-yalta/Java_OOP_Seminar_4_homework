package Scheduler;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;

public class Task {
    public int id;
    public String dataTime;
    public String creator;
    public String textTask;
    public Date deadline;

    Task(){
        Date dateCreation = new Date();
        SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        this.dataTime = myFormat.format(dateCreation);
        setCreator();
        setTextTask();
        setDeadline();
    }

    private void setCreator(){
        System.out.println("Введите ФИО автора задания");
        Scanner scan = new Scanner(System.in);
        this.creator = scan.nextLine();
    }

    private void setTextTask(){
        System.out.println("Введите текст задания");
        Scanner scan = new Scanner(System.in);
        this.textTask = scan.nextLine();
    }

    // Вводится время дедлайна (до которого задание действительно)
    private void setDeadline(){
        System.out.println("Введите крайний срок задания");
        System.out.println("Введите год, месяц, число, час, минуту и секунду");
        System.out.println("В формате yyyy-MM-dd HH:mm:ss");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = formatter.parse(str);
            this.deadline = date;
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Проверка времени дедлайна с текущим временем
    public boolean CheckDeadline(Task E){
        Date currentTime = new Date();
        if (currentTime.after(deadline)){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public String toString(){
        return String.format(
        "id: %d; Дата и время: %s: Автор задания: %s; Текст задания: %s; Задание действительно до: %s;", 
        id, dataTime, creator, textTask, deadline);
    }
}
