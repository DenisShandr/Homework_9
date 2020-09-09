package com.academy;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Task implements Serializable {

    private String name;
    private String category;
    private TaskPriority priority;
    private LocalDate executionDate;
    private String timeLeft;

    public Task(String name, String category, LocalDate executionDate, TaskPriority priority) {
        this.name = name;
        this.category = category;
        this.priority = priority;
        this.executionDate = executionDate;
        this.timeLeft = getTimeLeft(this.executionDate);
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
                ", time left = " + getTimeLeft(executionDate);
    }

    private String getTimeLeft(LocalDate date) {
        Period period = Period.between(LocalDate.now(), date);
        return (period.getYears() + " years, " +
                period.getMonths() + " months, " +
                period.getDays() + " days.");
    }

    public enum TaskPriority {

        HIGH("high"),
        MIDDLE("middle"),
        LOW("low");

        private final String value;

        TaskPriority(String value) {
            this.value = value;
        }
    }
}