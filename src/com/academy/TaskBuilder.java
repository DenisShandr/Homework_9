package com.academy;

import com.academy.Task.TaskPriority;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Scanner;

import static com.academy.Task.TaskPriority.*;

public class TaskBuilder  {

    static Scanner in = new Scanner(System.in);

    public static Task build() {
        String name = getString("Enter name of the task: ");
        String category = getString("Enter category of the task: ");
        LocalDate date = getDate("Enter execution date : ");
        TaskPriority priority = getPriority("Enter HIGH, MIDDLE or LOW priority: ");
        return new Task(name, category, date, priority);
    }

    public static Task edit(Task task) {
        System.out.println("you will edit the following task: ");
        System.out.println(task.toString());
        task.setName(getString("Enter new name: "));
        task.setCategory(getString("Enter new category: "));
        task.setExecutionDate(getDate("Enter new execution date: "));
        task.setPriority(getPriority("Enter new priority: "));
        return task;
    }

    private static LocalDate getDate(String s) {
        System.out.println(s);
        LocalDate date;
        int yyyy = getYear("Year: ");
        int mm = getMonth("Month: ");
        int dd = getDay("Enter day: ", yyyy, mm);
        if (LocalDate.of(yyyy, mm, dd).isBefore(LocalDate.now())) {
            date = getDate("That day has already passed. Enter correct date.");
        } else {
            date = LocalDate.of(yyyy, mm, dd);
        }
        return date;
    }

    private static TaskPriority getPriority(String s) {
        System.out.print(s);
        TaskPriority priority = null;
        switch (in.next()) {
            case "HIGH":
                priority = HIGH;
                return priority;
            case "MIDDLE":
                priority = MIDDLE;
                return priority;
            case "LOW":
                priority = LOW;
                return priority;
        }
        if (priority == null) {
            priority = getPriority("You must enter correct priority (HIGH, MIDDLE, LOW): ");
        }
        return priority;
    }

    private static int getYear(String s) {
        System.out.print(s);
        int year = in.nextInt();
        if (year < LocalDateTime.now().getYear()) {
            year = getYear("Enter correct year: ");
        }
        return year;
    }


    private static int getMonth(String s) {
        System.out.print(s);
        int month = in.nextInt();
        if (month > 12) {
            month = getMonth("No such month exist! Enter correct month: ");
        }
        return month;
    }

    private static String getString(String s) {
        System.out.print(s);
        return in.next();
    }

    private static int getDay(String s, int year, int month) {
        System.out.print(s);
        int day = in.nextInt();
        if (day > daysOfMonth(month, year)) {
            day = getDay("No such day exist! Enter correct day: ", year, month);
        }
        return day;
    }

    private static int daysOfMonth(int monthNumber, int year) {
        int feb = 28;
        if (leapYear(year)) {
            feb += 1;
        }
        switch (monthNumber) {
            case 2:
                return feb;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
        }
        return 31;
    }

    private static boolean leapYear(int year) {
        if ((((year % 4) == 0 && !((year % 100) == 0))) || ((year % 400) == 0) && (year % 4) == 0) {
            return true;
        }
        return false;
    }
}
