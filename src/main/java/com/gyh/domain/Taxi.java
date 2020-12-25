package com.gyh.domain;

import com.gyh.utils.DateUtil;

import java.util.Date;

public class Taxi {
    private String carNo;
    private Date buyDate;
    private String BrandName;
    private Long runningKito;
    private boolean isRepair;

    public Taxi(String catLine) {
        String[] carMessages = catLine.split("\\|");
        this.carNo = carMessages[0];
        this.buyDate = DateUtil.parseDate(carMessages[1]);
        BrandName = carMessages[2];
        this.runningKito = Long.parseLong(carMessages[3]);
        this.isRepair = "T".equals(carMessages[4])?true:false;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public Long getRunningKito() {
        return runningKito;
    }

    public void setRunningKito(Long runningKito) {
        this.runningKito = runningKito;
    }

    public boolean isRepair() {
        return isRepair;
    }

    public void setRepair(boolean repair) {
        isRepair = repair;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "carNo='" + carNo + '\'' +
                ", buyDate=" + buyDate +
                ", BrandName='" + BrandName + '\'' +
                ", runningKito=" + runningKito +
                ", isRepair=" + isRepair +
                '}';
    }
}
