package com.academy;

import com.academy.services.TaskSorter;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.academy.Task.TaskPriority.*;


public class Main {

    private static final String TASK_LIST_FILE = "taskListFile.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TaskManager taskManager = new TaskManager();
        Scanner in = new Scanner(System.in);

//        List<Task> taskList = new ArrayList<>();
//        taskList.add(new Task("Name1", "Category3", LocalDate.of(2020, 9, 10), LOW));
//        taskList.add(new Task("Name2", "Category6", LocalDate.of(2021, 9, 10), HIGH));
//        taskList.add(new Task("Name3", "Category2", LocalDate.of(2023, 12, 22), MIDDLE));
//        taskList.add(new Task("Name6", "Category1", LocalDate.of(2020, 12, 10), LOW));
//        taskList.add(new Task("Name5", "Category5", LocalDate.of(2020, 9, 23), HIGH));
//        taskList.add(new Task("Name4", "Category0", LocalDate.of(2020, 10, 1), LOW));
//        taskList.add(new Task("Name0", "Category4", LocalDate.of(2022, 8, 8), MIDDLE));
//


        taskManager.setTasks(loadFile().getTasks());



        boolean exit = true;
        while (exit) {
            System.out.println("Hello! This is Task Manager.");

            System.out.println("Command list: " + '\n' +
                    "   add : Add task." + '\n' +
                    "   delete : Delete task." + '\n' +
                    "   show : Show task list." + '\n' +
                    "   edit : Edit task." + '\n' +
                    "   sort : Run sorter tool." + '\n' +
                    "   exit : Exit program.");
            System.out.print("Enter command: ");
            switch (in.next()) {
                case "add":
                    taskManager.addTask();
                    saveFile(taskManager);
                    break;
                case "delete":
                    taskManager.deleteTask();
                    saveFile(taskManager);
                    break;
                case "show":
                    taskManager.showTasks();
                    break;
                case "edit":
                    taskManager.editTask();
                    saveFile(taskManager);
                    break;
                case "sort":
                    sorterTool(taskManager);
                    saveFile(taskManager);
                    break;
                case "exit":
                    exit = false;
                    break;
                default:
                    System.out.println("Incorrect command!");
                    break;
            }
        }


    }

    public static void saveFile(TaskManager taskManager) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(TASK_LIST_FILE);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(taskManager);
    }

    public static TaskManager loadFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(TASK_LIST_FILE);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        TaskManager taskManager = null;
        if (object instanceof TaskManager) {
            taskManager = (TaskManager) object;
        }
        return taskManager;
    }

    public static void sorterTool(TaskManager taskManager) {

        System.out.println("Sorter's command list: " + '\n' +
                "   name : Sort by name." + '\n' +
                "   category : Sort by category." + '\n' +
                "   date : Sort by execution date." + '\n' +
                "   priority : Sort by priority.");
        System.out.print("Enter command: ");
        switch (new Scanner(System.in).next()) {
            case "name":
                TaskSorter.sortByName(taskManager);
                break;
            case "category":
                TaskSorter.sortByCategory(taskManager);
                break;
            case "date":
                TaskSorter.sortByExecutionDate(taskManager);
                break;
            case "priority":
                TaskSorter.sortByPriority(taskManager);
                break;
            default:
                System.out.println("Incorrect command!");
                break;
        }


    }
}
