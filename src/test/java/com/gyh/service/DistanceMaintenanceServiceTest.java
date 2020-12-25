package com.gyh.service;

import com.gyh.domain.Taxi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DistanceMaintenanceServiceTest {
    private DistanceMaintenanceService distanceMaintenanceService = new DistanceMaintenanceService();
    @Before
    public void setup(){
    }
    @Test
    public void isDistanceMain_true() {
        Taxi taxi = buildTrueTaxi();
        Assert.assertEquals(true, distanceMaintenanceService.isDistanceMain(taxi));
    }
    @Test
    public void isDistanceMain_false() {
        Taxi taxi = buildFailTaxi();
        Assert.assertEquals(false, distanceMaintenanceService.isDistanceMain(taxi));
    }

    public Taxi buildFailTaxi(){
        String taxiString = "CAR0001|2044/05/01|Volkswagen|65535|F";
        Taxi taxi = new Taxi(taxiString);
        return taxi;

    }
    public Taxi buildTrueTaxi(){
        String taxiString = "CAR0001|2044/05/01|Volkswagen|69500|F";
        Taxi taxi = new Taxi(taxiString);
        return taxi;

    }
}