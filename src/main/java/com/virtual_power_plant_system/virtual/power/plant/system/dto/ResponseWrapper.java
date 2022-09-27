package com.virtual_power_plant_system.virtual.power.plant.system.dto;


import java.util.ArrayList;
import java.util.Collection;
public class ResponseWrapper {
    private String message;
    private String error;
    private Collection<BatteryDto> data;
    private int status;

    public ResponseWrapper(int status, Collection<BatteryDto> data) {
        this.data=data;
        this.status = status;
        this.message = "Successful";
    }
    public ResponseWrapper(int status, BatteryDto batteryDto) {
        this.data=new ArrayList<>();
        data.add(batteryDto);
        this.status = status;
        this.message = "Successful";

    }
    public ResponseWrapper(int status, String message) {
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

    public Collection<BatteryDto> getData() {
        return data;
    }

    public void setData(Collection<BatteryDto> data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
