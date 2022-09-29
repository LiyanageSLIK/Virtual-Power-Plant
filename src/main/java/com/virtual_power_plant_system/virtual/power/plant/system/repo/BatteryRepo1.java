package com.virtual_power_plant_system.virtual.power.plant.system.repo;

import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BatteryRepo1 extends JpaRepository<BatteryEntity,Integer> {

}
