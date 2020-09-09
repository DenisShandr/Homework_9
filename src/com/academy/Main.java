package com.academy;

import com.academy.services.TaskSorter;

import java.time.LocalDate;
import java.util.*;

import static com.academy.Task.TaskPriority.*;

public class Main {

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

//        taskManager.addTask();
//        taskManager.showTasks();
//        taskManager.editTask();
//
//
//        taskManager.showTasks();
//        taskManager.deleteTask();
//

        List<Task> taskList = new ArrayList<Task>();
        taskList.add(new Task("Name1", "Category3", LocalDate.of(2020, 9, 10), LOW));
        taskList.add(new Task("Name2", "Category6", LocalDate.of(2021, 9, 10), HIGH));
        taskList.add(new Task("Name3", "Category2", LocalDate.of(2023, 12, 22), MIDDLE));
        taskList.add(new Task("Name6", "Category1", LocalDate.of(2020, 12, 10), LOW));
        taskList.add(new Task("Name5", "Category5", LocalDate.of(2020, 9, 23), HIGH));
        taskList.add(new Task("Name4", "Category0", LocalDate.of(2020, 10, 1), LOW));
        taskList.add(new Task("Name0", "Category4", LocalDate.of(2022, 8, 8), MIDDLE));

        taskManager.setTasks(taskList);
        taskManager.showTasks();
        TaskSorter.sortByName(taskManager);


//        Comparator<Task> taskExecutionTimeSort =
//                (task1, task2) -> task1.getExecutionDate().compareTo(task2.getExecutionDate());
//        Comparator<Task> taskNameSort =
//                (task1, task2) -> task1.getName().compareTo(task2.getName());
//        Comparator<Task> taskCategorySort =
//                (task1, task2) -> task1.getCategory().compareTo(task2.getCategory());
//        Comparator<Task> taskPrioritySort =
//                (task1, task2) -> task1.getPriority().compareTo(task2.getPriority());
//
//        Collections.sort(taskManager.getTasks(), taskExecutionTimeSort);
//        taskManager.showTasks();
//
//        Collections.sort(taskManager.getTasks(), taskNameSort);
//        taskManager.showTasks();
//
//        Collections.sort(taskManager.getTasks(), taskCategorySort);
//        taskManager.showTasks();
//
//        Collections.sort(taskManager.getTasks(), taskPrioritySort);
//        taskManager.showTasks();


    }
}
