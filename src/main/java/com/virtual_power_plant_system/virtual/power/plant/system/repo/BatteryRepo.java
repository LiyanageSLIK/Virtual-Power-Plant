package com.virtual_power_plant_system.virtual.power.plant.system.repo;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class BatteryRepo  {

    BatteryDto batteryDto =new BatteryDto();

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
    public BatteryDto getById(int id) {
        this.batteryDto.setId(batteryDatabase.get(id).getId());
        this.batteryDto.setName(batteryDatabase.get(id).getName());
        this.batteryDto.setPostcode(batteryDatabase.get(id).getPostcode());
        this.batteryDto.setWattCapacity(batteryDatabase.get(id).getWattCapacity());
        return batteryDto;
    }

    public boolean containsValue(BatteryEntity batteryEntity) {
        return batteryDatabase.containsValue(batteryEntity);
    }
    public boolean contains(int id) {
        return batteryDatabase.containsKey(id);

    }
    public int itemCount() {

        return batteryDatabase.keySet().size();
    }

}
