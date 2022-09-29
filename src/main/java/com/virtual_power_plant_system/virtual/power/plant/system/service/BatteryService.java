package com.virtual_power_plant_system.virtual.power.plant.system.service;

import com.virtual_power_plant_system.virtual.power.plant.system.dto.BatteryDto;
import com.virtual_power_plant_system.virtual.power.plant.system.dto.ResponseWrapper;
import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
//import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo;
import com.virtual_power_plant_system.virtual.power.plant.system.repo.BatteryRepo1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BatteryService {
//    private final BatteryRepo batteryRepo = new BatteryRepo();
    @Autowired
    private  BatteryRepo1 batteryRepo1;






//    public List<BatteryDto> getAllBatteries() {
//        ArrayList<BatteryDto> batteryDtoList = new ArrayList<>();
//        for (BatteryEntity batteryEntity1 : batteryRepo.getAll()
//        ) {
//            batteryDtoList.add(new BatteryDto(batteryEntity1));
//        }
//        return batteryDtoList;
//    }
//
//    public BatteryDto getById(int id) throws Exception {
//        if (batteryRepo.contains(id)) {
//            return new BatteryDto(batteryRepo.getById(id));
//        } else {
//            throw new Exception("Battery not exists for ID:" + id);
//        }
//    }

    public BatteryDto addBattery(BatteryDto batteryDto) throws Exception {
        if (!batteryDto.getName().isEmpty()  && batteryDto.getPostcode() > 0
                && batteryDto.getWattCapacity() > 0) {
           BatteryEntity  batteryEntity = new BatteryEntity();
            if (true){

                batteryEntity = new BatteryEntity();
                batteryEntity.SetByDto(batteryDto);

//                if (batteryRepo.itemCount() == 0) {
//                    batteryEntity.setId(1);
//                } else {
//                    batteryEntity.setId(batteryRepo.lastKey() + 1);
//                }
//                batteryRepo.add(batteryEntity);
                ;

                return new BatteryDto(batteryRepo1.save(batteryEntity));
            } else {
                throw new Exception("Battery already exists for ID:" + batteryDto.getId());
            }
        } else {
            throw new Exception("Missing some properties for given battery");
        }
    }

//    public BatteryDto updateBattery(BatteryDto batteryDto, int id) throws Exception {
//        if (!batteryDto.getName().isEmpty() && batteryDto.getId() > 0 && batteryDto.getPostcode() > 0
//                && batteryDto.getWattCapacity() > 0) {
//            if (batteryRepo.contains(id)) {
//                batteryEntity = new BatteryEntity();
//                batteryEntity.SetByDto(batteryDto);
//                batteryEntity.setId(id);
//                batteryRepo.update(batteryEntity);
//                return new BatteryDto(batteryRepo.getById(batteryEntity.getId()));
//            } else {
//                throw new Exception("Battery not exists for ID:" + id);
//            }
//        } else {
//            throw new Exception("Missing some properties for given battery");
//        }
//    }
//
//    public BatteryDto deleteBattery(int id) throws Exception {
//        if (batteryRepo.contains(id)) {
//            return new BatteryDto(batteryRepo.delete(id));
//        } else {
//            throw new Exception("Battery not exists for ID:" + id);
//        }
//    }


}
