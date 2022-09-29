//package com.virtual_power_plant_system.virtual.power.plant.system.repo;
//
//import com.virtual_power_plant_system.virtual.power.plant.system.entity.BatteryEntity;
//import org.springframework.stereotype.Repository;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//@Repository
//public class BatteryRepo {
//
//    private final Map<Integer, BatteryEntity> batteryDatabase;
//
//    public BatteryRepo() {
//        this.batteryDatabase = new HashMap<>();
//    }
//
//    public Collection<BatteryEntity> getAll() {
//        return batteryDatabase.values();
//    }
//
//    public BatteryEntity getById(int id) {
//        return batteryDatabase.get(id);
//    }
//
//    public void add(BatteryEntity batteryEntity) {
//        batteryDatabase.put(batteryEntity.getId(), batteryEntity);
//    }
//
//    public void update(BatteryEntity batteryEntity) {
//        batteryDatabase.replace(batteryEntity.getId(), batteryEntity);
//    }
//
//    public BatteryEntity delete(int id) {
//        return batteryDatabase.remove(id);
//    }
//
//    public boolean contains(int id) {
//        return batteryDatabase.containsKey(id);
//
//    }
//
//    public int itemCount() {
//        return batteryDatabase.keySet().size();
//    }
//
//    public int lastKey() {
//        if (batteryDatabase.isEmpty()) {
//            return 0;
//        } else {
//            Object lastKey = batteryDatabase.keySet().toArray()[batteryDatabase.size() - 1];
//            return batteryDatabase.get(lastKey).getId();
//        }
//    }
//
//}
