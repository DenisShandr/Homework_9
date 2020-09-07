package com.academy;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static com.academy.Task.*;
import static com.academy.Task.TaskPriority.*;

public class TaskManager {

    Scanner in = new Scanner(System.in);

    List<Task> tasks;

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }


    @Override
    public String toString() {
        tasks.stream().map(task -> tasks.indexOf(task) + 1 + ": " + task.toString()).forEach(System.out::println);
        return "";
    }

    public void addTask(Task task){




        Date date = getString("Enter execution date : ");
        TaskPriority priority;
        System.out.print("Enter priority : ");
        switch (in.nextLine()){
            case "HIGH": priority = HIGH;
            break;
            case "MIDDLE": priority = MIDDLE;
            break;
            case "LOW": priority = LOW;
            break;
        }




        tasks.add(new Task(getString("Enter name of the task: "),
                           getString("Enter category of the task: "), date, priority));
    }

    private String getString(String s) {
        System.out.print(s);
        return in.nextLine();
    }


}
