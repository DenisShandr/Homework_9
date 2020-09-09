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
        TaskManager taskManager = new TaskManager();

        taskManager.addTask();
        taskManager.showTasks();
        taskManager.editTask();


        taskManager.showTasks();
        taskManager.deleteTask();


        taskManager.showTasks();

    }
}
