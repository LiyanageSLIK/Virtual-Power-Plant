package com.virtual_power_plant_system.virtual.power.plant.system.service;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
//import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo;
import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BatteryService {
    @Autowired
    private BatteryRepo batteryRepo;


    public List<BatteryDto> getAllBatteries() {
        ArrayList<BatteryDto> batteryDtoList = new ArrayList<>();
        for (BatteryEntity batteryEntity1 : batteryRepo.findAll()) {
            batteryDtoList.add(new BatteryDto(batteryEntity1));
        }
        return batteryDtoList;
    }

    public BatteryDto getById(int id) throws Exception {
        if (batteryRepo.existsById(id)) {
            return new BatteryDto(batteryRepo.findById(id).get());
        } else {
            throw new Exception("Battery not exists for ID:" + id);
        }
    }

    public BatteryDto addBattery(BatteryDto batteryDto) throws Exception {
        if (!batteryDto.getName().isEmpty()  && batteryDto.getPostcode() > 0
                && batteryDto.getWattCapacity() > 0) {
                return new BatteryDto(batteryRepo.save(new BatteryEntity(batteryDto)));
        } else {
            throw new Exception("Missing some properties for given battery");
        }
    }

    public BatteryDto updateBattery(BatteryDto batteryDto, int id) throws Exception {
        if (!batteryDto.getName().isEmpty() && batteryDto.getId() > 0 && batteryDto.getPostcode() > 0
                && batteryDto.getWattCapacity() > 0) {
            if (batteryRepo.existsById(id)) {
                BatteryEntity batteryEntity=(batteryRepo.findById(id).get());
                batteryEntity.SetByDto(batteryDto);
                return new BatteryDto(batteryRepo.save(batteryEntity));
            } else {
                throw new Exception("Battery not exists for ID:" + id);
            }
        } else {
            throw new Exception("Missing some properties for given battery");
        }
    }

    public BatteryDto deleteBattery(int id) throws Exception {
        if (batteryRepo.existsById(id)) {
            BatteryEntity batteryEntity=(batteryRepo.findById(id).get());
            batteryRepo.deleteById(id);
            return new BatteryDto(batteryEntity);
        } else {
            throw new Exception("Battery not exists for ID:" + id);
        }
    }


}
