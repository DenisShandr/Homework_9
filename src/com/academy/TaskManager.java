package com.academy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager implements Serializable {

    private static Scanner in = new Scanner(System.in);

    private List<Task> tasks = new ArrayList<>();

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

    public void deleteTask() {
        System.out.print("Enter the number of the task you want to delete: ");
        int index = 0;
        try {
            index = in.nextInt();
            if (index > tasks.size()) {
                System.out.println("There is no task with this number!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Incorrect number! ");
            return;
        }
        tasks.remove(index - 1);
    }

    public void showTasks() {
        System.out.println();
        System.out.println("==============[Task list]==============");
        if (tasks.size() == 0) {
            System.out.println("There is no tasks.");
        }
        toString();
        System.out.println("=================[End]=================");
        System.out.println();
    }

    public void editTask() {
        System.out.print("Enter the number of the task you want to edit: ");
        int index = 0;
        try {
            index = in.nextInt();
            if (index > tasks.size() || index == 0) {
                System.out.println("There is no task with this number!");
                return;
            }
        } catch (Exception e) {
            System.out.println("Incorrect number! ");
            return;
        }
        TaskBuilder.edit(tasks.get(index - 1));
    }


}

