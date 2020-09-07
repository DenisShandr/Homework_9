package com.academy;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.academy.Task.TaskPriority.*;

public class Main {

    public static void main(String[] args) {

        List<Task> taskList = new ArrayList<>();
        Date date = new Date();

        Task task1 = new Task("name1", "something", LOW, date);
        Task task2 = new Task("name2", "something", HIGH, date);
        Task task3 = new Task("name3", "something", MIDDLE, date);
        Task task4 = new Task("name4", "something", LOW, date);
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        System.out.println(date);

        TaskManager taskManager = new TaskManager();

        taskManager.setTasks(taskList);

//        taskManager.getTasks().forEach(System.out::println);
//        taskManager.getTasks()
//                .forEach(element -> System.out.println(taskManager.getTasks().indexOf(element) + 1 + ": " + element.toString()));
        taskManager.toString();


    }
}
