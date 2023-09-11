package com.concepts.java.datastructures;

import java.util.Arrays;

public class ArrayExample {
    public void displayWeekDays() {
        String[] weekDays = new String[7];
        System.out.println(Arrays.toString(weekDays)); // returns [null, null, null, null, null, null, null]

        weekDays[0] = "Monday";
        System.out.println(Arrays.toString(weekDays)); // returns [Monday, null, null, null, null, null, null]

        weekDays = new String[] { "Mon", "Tue", "Wed" };
        System.out.println(Arrays.toString(weekDays)); // returns [Mon, Tue, Wed]

        for (String day : weekDays) {
            System.out.println("Week day: " + day);
        }

        for (int i = 0; i < weekDays.length; i++) {
            weekDays[i] = weekDays[i].toUpperCase();
        }
        
        System.out.println(Arrays.toString(weekDays)); // returns [MON, TUE, WED]
    }
}
