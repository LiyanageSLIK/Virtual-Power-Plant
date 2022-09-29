package com.virtual_power_plant_system.virtual.power.plant.system.controllers;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.dto.ResponseWrapper;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import com.virtual_power_plant_system.virtual.power.plant.system.service.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("ALL")
@RestController
@RequestMapping("/battery")
public class BatteryControllers {
    @Autowired
    private BatteryService batteryService;


//    @GetMapping("")
//    public ResponseWrapper getBattery() {
//        try {
//            return new ResponseWrapper(200, batteryService.getAllBatteries());
//        } catch (Exception e) {
//            return new ResponseWrapper(400, "Empty List");
//        }
//    }

//    @GetMapping("/{id}")
//    public ResponseWrapper getByID(@PathVariable(value = "id") int id) {
//        try {
//            return new ResponseWrapper(200, batteryService.getById(id));
//        } catch (Exception e) {
//            return new ResponseWrapper(400, e.getMessage());
//        }
//    }

    @PostMapping("")
    public ResponseWrapper addBattery(@RequestBody BatteryDto batteryDto) {
        try {
            return new ResponseWrapper(200, batteryService.addBattery(batteryDto));
        } catch (Exception e) {
            return new ResponseWrapper(400, e.getMessage());
        }
    }

//    @PutMapping("/{id}")
//    public ResponseWrapper updateBattery(@RequestBody BatteryDto batteryDto, @PathVariable(value = "id") int id) {
//        try {
//            return new ResponseWrapper(200, batteryService.updateBattery(batteryDto, id));
//        } catch (Exception e) {
//            return new ResponseWrapper(400, e.getMessage());
//        }
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseWrapper deleteBattery(@PathVariable(value = "id") int id) {
//        try {
//            return new ResponseWrapper(200, batteryService.deleteBattery(id));
//        } catch (Exception e) {
//            return new ResponseWrapper(400, e.getMessage());
//        }
//    }

}
