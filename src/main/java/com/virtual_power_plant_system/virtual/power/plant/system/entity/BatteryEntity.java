package com.virtual_power_plant_system.virtual.power.plant.system.entity;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
@Table(name = "Batteries")
public class BatteryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "PostCode")
    private int postcode;
    @Column(name = "WattCapacity")
    private float wattCapacity;

    public BatteryEntity() {
    }

    public void SetByDto(BatteryDto batteryDto) {
//        this.id = batteryDto.getId();
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
