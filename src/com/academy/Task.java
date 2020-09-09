package com.academy;

import java.time.LocalDate;

public class Task {

    private String name;
    private String category;
    private TaskPriority priority;
    private LocalDate executionDate;
    private String timeLeft;

    public Task(String name, String category, LocalDate executionDate, TaskPriority priority, String timeLeft) {
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.executionDate = executionDate;
        this.timeLeft = timeLeft;
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
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

    public LocalDate getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }


    @Override
    public String toString() {
        return "name = " + name +
                ", category = " + category +
                ", execution date = " + executionDate +
                ", priority = " + priority +
                ", time left = " + timeLeft;
    }

    public enum TaskPriority {

        HIGH ("high"),
        MIDDLE ("middle"),
        LOW ("low");

        private final String value;

        TaskPriority(String value) {
            this.value = value;
        }
    }
}