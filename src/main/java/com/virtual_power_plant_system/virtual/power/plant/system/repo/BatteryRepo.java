package com.virtual_power_plant_system.virtual.power.plant.system.repo;

import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BatteryRepo extends JpaRepository<BatteryEntity,Integer> {

    default BatteryEntity getById(int id){
        return this.findById(id).get();
    }

}
