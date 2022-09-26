package com.virtual_power_plant_system.virtual.power.plant.system.service;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryRequestDto;
import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryResponseDto;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class BatteryService {
private final BatteryRepo batteryRepo=new BatteryRepo();

private BatteryResponseDto batteryResponseDto;

private BatteryEntity batteryEntity;




    public List<BatteryEntity> getAllBatteries() {
        return new ArrayList<>(batteryRepo.getAll());
    }

    public BatteryEntity addBattery( BatteryRequestDto batteryRequestDto) throws Exception {
        if (!batteryRequestDto.getName().isEmpty() && batteryRequestDto.getId()>0 && batteryRequestDto.getPostcode()>0
                && batteryRequestDto.getWattCapacity()>0) {
            batteryEntity=new BatteryEntity();
            if (!batteryRepo.contains(batteryRequestDto.getId())) {
                batteryEntity.setId(batteryRepo.itemCount()+1);
                batteryEntity.setName(batteryRequestDto.getName());
                batteryEntity.setPostcode(batteryRequestDto.getPostcode());
                batteryEntity.setWattCapacity(batteryRequestDto.getWattCapacity());
                batteryRepo.put(batteryEntity);
                batteryResponseDto=new BatteryResponseDto(200,batteryRepo.getById(batteryEntity.getId()));
                return (batteryRepo.getById(batteryEntity.getId()));
            } else {
                throw new Exception("Battery already exists for ID:" + batteryRequestDto.getId());
            }
        } else {
            throw new Exception("Missing some properties for given battery");
        }
    }

}
