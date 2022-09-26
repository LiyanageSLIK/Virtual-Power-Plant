package com.virtual_power_plant_system.virtual.power.plant.system.repo;

import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class BatteryRepo  {

    private final Map<Integer, BatteryEntity> batteryDatabase;
    public BatteryRepo() {
        this.batteryDatabase = new HashMap<>();
    }
    public void put(BatteryEntity batteryEntity) {
        batteryDatabase.put(batteryEntity.getId(), batteryEntity);
    }
    public Collection<BatteryEntity> getAll() {
        return batteryDatabase.values();
    }
    public BatteryEntity getById(int id) {
        return  batteryDatabase.get(id);
    }

    public boolean containsValue(BatteryEntity batteryEntity) {
        batteryDatabase.containsValue(batteryEntity);
        return false;
    }
    public boolean contains(int id) {
        return batteryDatabase.containsKey(id);

    }
    public int itemCount() {
        return batteryDatabase.keySet().size();
    }

}
