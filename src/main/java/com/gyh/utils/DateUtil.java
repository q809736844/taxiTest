package com.gyh.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static  final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy/MM/dd");
    public static Calendar setCalendar(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
    public static Date parseDate(String date){
        try{
            return DATE_FORMAT.parse(date);
        }catch (ParseException e){
            throw new RuntimeException("Date parse error");
        }
    }
    public static int yearScope(Calendar from, Calendar to) {
        int fromYear = from.get(Calendar.YEAR);
        int toYear = to.get(Calendar.YEAR);

        return Math.abs(fromYear - toYear);
    }
    public static int monthScope(Calendar from, Calendar to) {
        int fromMonth = from.get(Calendar.MONTH);
        int toMonth = to.get(Calendar.MONTH);

        return Math.abs(fromMonth - toMonth);
    }

    public static Calendar addYear(Calendar calendar, int days) {
       calendar.add(Calendar.DATE,days);
       return calendar;
    }

    public static boolean isBeforeDate(Calendar addDate,Calendar nowDate) {
        addDate.add(Calendar.MONTH,-1);
        addDate.set(Calendar.DATE,1);
        addDate.add(Calendar.DATE,-1);

        System.out.println(addDate.getTime().toString());
        return addDate.before(nowDate);
    }

    public static void main(String[] args) {
        String date1 = "2020/3/1";
        String date2 = "2020/1/31";
        System.out.println(isBeforeDate(setCalendar(parseDate(date1)),setCalendar(parseDate(date2))));
    }
}
