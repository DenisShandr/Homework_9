package com.academy;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.academy.Task.TaskPriority.*;

public class Main {

    public static void main(String[] args) {

        List<Task> taskList = new ArrayList<>();
        TaskManager taskManager = new TaskManager();
//        Task task1 = new Task("name1", "something", LocalDate.now(), LOW);
//        Task task2 = new Task("name2", "something", LocalDate.now(), HIGH);
//        Task task3 = new Task("name3", "something", LocalDate.now(), MIDDLE);
//        Task task4 = new Task("name4", "something", LocalDate.now(), LOW);
//        taskList.add(task1);
//        taskList.add(task2);
//        taskList.add(task3);
//        taskList.add(task4);
//        taskManager.setTasks(taskList);

        taskManager.addTask();
        taskManager.showTasks();
        taskManager.editTask();


        taskManager.showTasks();
        taskManager.deleteTask();


        taskManager.showTasks();
//        LocalDate date = LocalDate.of(2021, 2, 9);
//
//        Period period = Period.between(LocalDate.now(), date);
//        System.out.println(period.getYears() + "." + period.getMonths() + "." + period.getDays());


    }
}
