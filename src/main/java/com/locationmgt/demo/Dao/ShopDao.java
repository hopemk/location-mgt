/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.demo.Dao;

import com.locationmgt.demo.entity.Shop;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nashey
 */
@Repository
public interface ShopDao extends JpaRepository<Shop, Long>{

    public List<Shop> findAllByShopId(Long Id);

    public List<Shop> findByShopId(Long id);
    
}
