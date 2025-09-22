package com.kce.airline.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    public static String getDateTime() {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return dt.format(f);
    }

    public static String getTime() {
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm");
        return dt.format(f);
    }
}
