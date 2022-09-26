package com.virtual_power_plant_system.virtual.power.plant.system.dto;

import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import java.util.Collection;
import java.util.List;

public class BatteryDto {
    private int id;
    private String name;
    private int postcode;
    private float wattCapacity;
    private String message;
    private String error;
    private Collection<BatteryEntity> data;
    private int status;



    public BatteryDto(int status,Collection<BatteryEntity> data) {
        this.data=data;
        this.status = status;
        this.message = "Successful";
    }

    public BatteryDto(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public BatteryDto(int status, BatteryEntity batteryEntity) {
        this.id=batteryEntity.getId();
        this.name=batteryEntity.getName();
        this.postcode=batteryEntity.getPostcode();
        this.wattCapacity=batteryEntity.getWattCapacity();
        this.status=status;
        this.message = "Successful";

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public float getWattCapacity() {
        return wattCapacity;
    }

    public void setWattCapacity(float wattCapacity) {
        this.wattCapacity = wattCapacity;
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

    public void setData(List<BatteryEntity> data) {
        this.data = data;
    }
}
