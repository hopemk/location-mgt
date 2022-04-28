/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.demo.service;

import com.locationmgt.demo.dto.ShopDto;
import com.locationmgt.demo.entity.Shop;
import java.util.List;

/**
 *
 * @author nashey
 */

public interface ShopService {
    
    String saveShop(ShopDto shopDto);
    
    List<Shop> findAllShopsByAreaId(Long id);
    
}
