package com.gyh.service;

import com.gyh.domain.Taxi;
import com.gyh.utils.DateUtil;
import javafx.scene.control.TableColumn;

import java.util.Calendar;
import java.util.Date;

public class TimeMaintenanceService {
    public boolean isTimeMaintenance(Taxi taxi,String date){
        Calendar from = DateUtil.setCalendar(taxi.getBuyDate());
        Calendar to = DateUtil.setCalendar(DateUtil.parseDate(date));
        int year = DateUtil.yearScope(from,to);
        int month = DateUtil.monthScope(from,to);
        boolean isRepair = taxi.isRepair();
        boolean isflag = false;
        isflag = judgeMaintenance(year,month,isRepair);
        return isflag;
    }


    public boolean judgeMaintenance(int year,int month,boolean isRepair){
        if(isRepair){
            return month >= 2 && month <= 3 ? true:false;
        }
        if(year < 3){
            return month >= 11 && month <=12 ? true:false;
        }
        if(year >= 3){
            return month >= 5 && month <= 6 ? true:false;
        }
        return false;
    }
    public static void main(String[] args) {
        Taxi taxi1 = new Taxi("CAR0001|2044/05/01|Volkswagen|69500|F");
        Taxi taxi2 = new Taxi("CAR0001|2041/07/01|Volkswagen|69500|F");
        TimeMaintenanceService timeMaintenanceService = new TimeMaintenanceService();
      //  System.out.println(timeMaintenanceService.yearScope(taxi1.getBuyDate(),taxi2.getBuyDate()));

    }
}
