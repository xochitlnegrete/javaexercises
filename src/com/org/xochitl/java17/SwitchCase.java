package com.org.xochitl.java17;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchCase {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        boolean freeDay = switch (dayOfWeek)    {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                System.out.println("Work work work");
                yield false;
            }
            case SATURDAY, SUNDAY -> {
                System.out.println("Enjoy our free day");
                yield true;
            }
        };
        System.out.println("Free day: " + freeDay);
    }
}
