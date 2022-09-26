package com.virtual_power_plant_system.virtual.power.plant.system.controllers;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import com.virtual_power_plant_system.virtual.power.plant.system.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/batteries")

public class BatteriesControllers {
@Autowired
    private BatteryService batteryService;
    @PostMapping("/add")

    public BatteryDto addBattery(@RequestBody BatteryEntity batteryEntity){
        try {
            return new BatteryDto(200, batteryService.addBattery(batteryEntity));
        } catch (Exception e) {
            return new BatteryDto(400, e.getMessage());
        }

    }

    @GetMapping ("/getall")

    public BatteryDto getBattery(){

        try {
            return new BatteryDto(200,batteryService.getAllBatteries());
        } catch (Exception e) {
            return new BatteryDto(400, "Empty List");
        }
    }

}
