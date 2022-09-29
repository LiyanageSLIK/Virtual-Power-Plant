package com.virtual_power_plant_system.virtual.power.plant.system.entity;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class BatteryEntity {

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "CUST_SEQ")
    private int id;
    @Column(name = "Name")
    private String name;
    private int postcode;
    private float wattCapacity;

    public BatteryEntity() {
    }

    public void SetByDto(BatteryDto batteryDto) {
        this.id = batteryDto.getId();
        this.name = batteryDto.getName();
        this.postcode = batteryDto.getPostcode();
        this.wattCapacity = batteryDto.getWattCapacity();
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
