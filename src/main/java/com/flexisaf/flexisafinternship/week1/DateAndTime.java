package com.flexisaf.flexisafinternship.week1;

import java.time.*;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAmount;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {
        int year = 1994;
        int month;
        String day;
        for(month = 1; month <= 12; month++) {
         YearMonth monthOfYear = YearMonth.of(year, month);
         int daysInMonth = monthOfYear.lengthOfMonth();
         String monthName = monthOfYear.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

            System.out.println("In the year " + year + ", the month of " + monthName + " had " + daysInMonth);
        }

    }

}
