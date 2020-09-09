package com.academy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import static com.academy.Task.TaskPriority;
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

    public void addTask() {
        tasks.add(TaskBuilder.build());
    }

    public void deleteTask(){
        System.out.print("Enter the number of the task you want to delete: ");
        int index = 0;
        try {
            index = in.nextInt();
            if (index > tasks.size()){
                System.out.println("There is no task with this number!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Incorrect number! ");
            return;
        }

        tasks.remove(index - 1);
    }

    public void showTasks(){
        toString();
    }


}

