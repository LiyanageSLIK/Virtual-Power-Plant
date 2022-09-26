package com.virtual_power_plant_system.virtual.power.plant.system.dto;

import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;

import java.util.ArrayList;
import java.util.Collection;
public class BatteryResponseDto {
    private String message;
    private String error;
    private Collection<BatteryEntity> data;
    private int status;

    public BatteryResponseDto(int status, Collection<BatteryEntity> data) {
        this.data=data;
        this.status = status;
        this.message = "Successful";
    }
    public BatteryResponseDto(int status, BatteryEntity batteryEntity) {
        this.data=new ArrayList<>();
        data.add(batteryEntity);
        this.status = status;
        this.message = "Successful";

    }
    public BatteryResponseDto(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Collection<BatteryEntity> getData() {
        return data;
    }

    public void setData(Collection<BatteryEntity> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
