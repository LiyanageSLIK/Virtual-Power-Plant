package com.virtual_power_plant_system.virtual.power.plant.system.service;


import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class BatteryService {
private final BatteryRepo batteryRepo;

    public BatteryService(BatteryRepo batteryRepo) {
        this.batteryRepo = batteryRepo;
    }

    public List<BatteryEntity> getAllBatteries() {
        return new ArrayList<>(batteryRepo.getAll());
    }

    public BatteryEntity addBattery( BatteryEntity batteryEntity) throws Exception {
        if (!batteryEntity.getName().isEmpty()
                && batteryEntity.getPostcode()>0 && batteryEntity.getWattCapacity()>0) {

            if (!batteryRepo.containsValue(batteryEntity)) {
                batteryRepo.put(batteryEntity);
                return batteryEntity;
            } else {
                throw new Exception("Battery already exists for ID:" + batteryEntity.getId());
            }
        } else {
            throw new Exception("Missing some properties for given battery");
        }
    }

}
