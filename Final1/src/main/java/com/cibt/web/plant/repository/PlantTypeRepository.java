/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cibt.web.plant.repository;

import com.cibt.web.plant.entity.PlantType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Maharjan
 */
public interface PlantTypeRepository extends JpaRepository<PlantType, Integer>{
    
}
