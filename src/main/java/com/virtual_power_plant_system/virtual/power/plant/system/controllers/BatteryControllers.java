package com.virtual_power_plant_system.virtual.power.plant.system.controllers;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.dto.ResponseWrapper;
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
    public ResponseWrapper addBattery(@RequestBody BatteryDto batteryDto){
        try {
            return new ResponseWrapper(200,batteryService.addBattery(batteryDto));
        } catch (Exception e) {
            return new ResponseWrapper(400, e.getMessage());
        }
    }

    @GetMapping ("")
    public ResponseWrapper getBattery(){
        try {
            return new ResponseWrapper(200,batteryService.getAllBatteries());
        } catch (Exception e) {
            return new ResponseWrapper(400, "Empty List");
        }
    }

}
