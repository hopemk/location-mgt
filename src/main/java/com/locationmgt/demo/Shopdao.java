/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.demo;

import com.locationmgt.demo.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author nashey
 */
public interface Shopdao extends JpaRepository<Shop, Long>{
    
}
