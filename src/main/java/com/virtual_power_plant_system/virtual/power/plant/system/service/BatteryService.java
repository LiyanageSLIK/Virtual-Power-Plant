package com.virtual_power_plant_system.virtual.power.plant.system.service;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.dto.ResponseWrapper;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class BatteryService {
private final BatteryRepo batteryRepo=new BatteryRepo();

private ResponseWrapper responseWrapper;

private BatteryEntity batteryEntity;

    public List<BatteryDto> getAllBatteries() {
        ArrayList<BatteryDto> batteryDtoList = new ArrayList<>();
        for (BatteryEntity batteryEntity1:batteryRepo.getAll()
             ) {
            batteryDtoList.add(new BatteryDto(batteryEntity1));
        }
        return batteryDtoList;
    }

    public BatteryDto addBattery(BatteryDto batteryDto) throws Exception {
        if (!batteryDto.getName().isEmpty() && batteryDto.getId()>0 && batteryDto.getPostcode()>0
                && batteryDto.getWattCapacity()>0) {
            if (!batteryRepo.contains(batteryDto.getId())) {
                batteryEntity=new BatteryEntity();
                batteryEntity.SetByDto(batteryDto);
                batteryEntity.setId(batteryRepo.itemCount()+1);
                batteryRepo.put(batteryEntity);
                return (batteryRepo.getById(batteryEntity.getId()));
            } else {
                throw new Exception("Battery already exists for ID:" + batteryDto.getId());
            }
        } else {
            throw new Exception("Missing some properties for given battery");
        }
    }

}
