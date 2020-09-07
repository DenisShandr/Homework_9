package com.academy;

import java.util.Date;

public class Task {

    private String name;
    private String category;
    private TaskPriority priority;
    private Date executionDate;

    public Task(String name, String category, Date executionDate, TaskPriority priority) {
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.executionDate = executionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public Date getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Date executionDate) {
        this.executionDate = executionDate;
    }


    @Override
    public String toString() {
        return "name = " + name +
                ", category = " + category +
                ", execution date = " + executionDate +
                ", priority = " + priority;
    }

    public enum TaskPriority {

        HIGH (1),
        MIDDLE (2),
        LOW (3);

        TaskPriority(int i) {
        }
    }
}