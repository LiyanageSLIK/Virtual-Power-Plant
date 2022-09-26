package com.virtual_power_plant_system.virtual.power.plant.system.entity;
import javax.persistence.*;
import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class BatteryEntity {

//    id
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
    private int id;
//    name
    @Column(name = "Name")
    private String name;
//    postcode
    private int postcode;
//    wattCapacity
    private float wattCapacity;

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
