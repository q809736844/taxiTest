package com.gyh.service;

import com.gyh.domain.Taxi;
import com.gyh.utils.DateUtil;

import java.util.Calendar;

public class WriteOffCar {
    public boolean isWriteOffCar(Taxi taxi,String date){
        Calendar from = DateUtil.setCalendar(taxi.getBuyDate());
        Calendar to = DateUtil.setCalendar(DateUtil.parseDate(date));

        int days = taxi.isRepair()?3*365:6*365;
        Calendar addCalendar = DateUtil.addYear(from,days);
        return DateUtil.isBeforeDate(addCalendar,to);
    }
}
