package com.academy;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.academy.Task.TaskPriority.*;

public class Main {

    public static void main(String[] args) {

        List<Task> taskList = new ArrayList<>();
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task("name1", "something", LocalDate.now(), LOW);
        Task task2 = new Task("name2", "something", LocalDate.now(), HIGH);
        Task task3 = new Task("name3", "something", LocalDate.now(), MIDDLE);
        Task task4 = new Task("name4", "something", LocalDate.now(), LOW);
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
        taskManager.setTasks(taskList);

        taskManager.addTask();


        taskManager.showTasks();
        taskManager.deleteTask();


        taskManager.showTasks();

//        Scanner in = new Scanner(System.in);
//        int year = in.nextInt();
//
//        if ((((year % 4) == 0 && !((year % 100) == 0))) || ((year % 400) == 0) && (year % 4) == 0){
//            System.out.println(true);;
//        } else System.out.println(false);

    }
}
