package com.gyh.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static  final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");

    public static Date parseDate(String date){
        try{
            return DATE_FORMAT.parse(date);
        }catch (ParseException e){
            throw new RuntimeException("Date parse error");
        }
    }
}
