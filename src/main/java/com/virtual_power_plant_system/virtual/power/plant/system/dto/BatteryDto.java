package com.virtual_power_plant_system.virtual.power.plant.system.dto;

import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;

public class BatteryDto {
    private int id=0;
    private String name="";
    private int postcode=0;
    private float wattCapacity=0;

    public BatteryDto() {
    }



    public BatteryDto(BatteryEntity batteryEntity) {
        this.id = batteryEntity.getId();
        this.name = batteryEntity.getName();
        this.postcode = batteryEntity.getPostcode();
        this.wattCapacity = batteryEntity.getWattCapacity();
    }



    public boolean isValidDto(int id){
        if (this.name.isEmpty() || this.id <= 0 || this.postcode <= 0
                || this.wattCapacity <= 0 || this.id!=id) {
            return false;
        }
        return true;
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
}
