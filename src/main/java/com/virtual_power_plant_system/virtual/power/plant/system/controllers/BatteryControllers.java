package com.virtual_power_plant_system.virtual.power.plant.system.controllers;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryRequestDto;
import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryResponseDto;
import com.virtual_power_plant_system.virtual.power.plant.system.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/battery")
public class BatteryControllers {
    @Autowired
    private BatteryService batteryService;
    @PostMapping("")
    public BatteryResponseDto addBattery(@RequestBody BatteryRequestDto batteryRequestDto){
        try {
            return new BatteryResponseDto(200,batteryService.addBattery(batteryRequestDto));
        } catch (Exception e) {
            return new BatteryResponseDto(400, e.getMessage());
        }

    }

    @GetMapping ("")
    public BatteryResponseDto getBattery(){

        try {
            return new BatteryResponseDto(200,batteryService.getAllBatteries());
        } catch (Exception e) {
            return new BatteryResponseDto(400, "Empty List");
        }
    }

}
