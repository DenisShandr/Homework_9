package com.academy.services;

import com.academy.Task;
import com.academy.TaskManager;
import java.util.Collections;
import java.util.Comparator;

public interface TaskSorter {

    static void sortByName(TaskManager taskManager) {
        Comparator<Task> taskNameSort =
                (task1, task2) -> task1.getName().compareTo(task2.getName());
        Collections.sort(taskManager.getTasks(), taskNameSort);
        taskManager.showTasks();
    }

    static void sortByCategory(TaskManager taskManager) {
        Comparator<Task> taskCategorySort =
                (task1, task2) -> task1.getCategory().compareTo(task2.getCategory());
        Collections.sort(taskManager.getTasks(), taskCategorySort);
        taskManager.showTasks();
    }

    static void sortByExecutionDate(TaskManager taskManager) {
        Comparator<Task> taskExecutionTimeSort =
                (task1, task2) -> task1.getExecutionDate().compareTo(task2.getExecutionDate());
        Collections.sort(taskManager.getTasks(), taskExecutionTimeSort);
        taskManager.showTasks();
    }

    static void sortByPriority(TaskManager taskManager) {
        Comparator<Task> taskPrioritySort =
                (task1, task2) -> task1.getPriority().compareTo(task2.getPriority());
        Collections.sort(taskManager.getTasks(), taskPrioritySort);
        taskManager.showTasks();
    }

}
