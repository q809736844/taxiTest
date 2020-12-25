package com.gyh.service;

import com.gyh.domain.Taxi;

public class DistanceMaintenanceService {
    public boolean isDistanceMain(Taxi taxi){
        boolean isflag = false;
        Long runningKito = taxi.getRunningKito();
        if(calculationKito(runningKito) <= 500){
            isflag = true;
        }
        return isflag;
    }

    public Long calculationKito(Long runningKito) {
        Long afterMaintenanceKito = runningKito % 10000;
        if(afterMaintenanceKito==0){
            return 0L;
        }
        return 10000 - afterMaintenanceKito;
    }
}
