package com.virtual_power_plant_system.virtual.power.plant.system.service;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BatteryService {
    @Autowired
    private BatteryRepo batteryRepo;


    public List<BatteryDto> getAll() {
        ArrayList<BatteryDto> batteryDtoList = new ArrayList<>();
        for (BatteryEntity batteryEntity1 : batteryRepo.findAll()) {
            BatteryDto batteryDto=new BatteryDto(batteryEntity1);
            batteryDtoList.add(batteryDto);
        }
        return batteryDtoList;
    }

    public BatteryDto getById(int id) throws Exception {
        if (batteryRepo.existsById(id)) {
            return new BatteryDto(batteryRepo.getById(id));
        } else {
            throw new Exception("Battery not exists for ID:" + id);
        }
    }

    public BatteryDto add(BatteryDto batteryDto) throws Exception {
        if (!batteryDto.isValidDto(0)) {
            BatteryEntity batteryEntity=new BatteryEntity(batteryDto);
            return new BatteryDto(batteryRepo.save(batteryEntity));
        } else {
            throw new Exception("Missing some properties for given battery");
        }
    }

    public BatteryDto update(BatteryDto batteryDto, int id) throws Exception {
        if (!batteryDto.isValidDto(id)) {
            throw new Exception("Missing some properties for given battery");
        }
        if (!batteryRepo.existsById(id)) {
            throw new Exception("Battery not exists for ID:" + id);
        }
        BatteryEntity batteryEntity = (batteryRepo.getById(id));
        batteryEntity.SetByDto(batteryDto);
        return new BatteryDto(batteryRepo.save(batteryEntity));
    }

    public BatteryDto delete(int id) throws Exception {
        if (batteryRepo.existsById(id)) {
            BatteryEntity batteryEntity=(batteryRepo.getById(id));
            batteryRepo.deleteById(id);
            return new BatteryDto(batteryEntity);
        } else {
            throw new Exception("Battery not exists for ID:" + id);
        }
    }

}
