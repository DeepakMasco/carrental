package com.navi.project.carrental.repository;

import com.navi.project.carrental.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {
    List<Vehicle> findByBranch_IdAndType(String id, String type);
    List<Vehicle> findByBranch_Id(String id);
}
