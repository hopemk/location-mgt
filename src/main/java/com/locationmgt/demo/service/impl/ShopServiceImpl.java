/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.demo.service.impl;

import com.locationmgt.demo.Dao.AreaDao;
import com.locationmgt.demo.Dao.ShopDao;
import com.locationmgt.demo.dto.ShopDto;
import com.locationmgt.demo.entity.Shop;
import com.locationmgt.demo.service.ShopService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nashey
 */
@Service
public class ShopServiceImpl implements ShopService{
    
    @Autowired
    private ShopDao shopDao;
    
    @Autowired
    private AreaDao areaDao;

    @Override
    public String saveShop(ShopDto shopDto) {
        Shop shop = new Shop();
        shop.setName(shopDto.getName());
        shop.setArea(areaDao.findById(shopDto.getAreaId()).get());
        shop.setAddress(shopDto.getAddress());
        shop.setDateCreated(new LocalDate());
        
        return "success";
    }

    @Override
    public List<Shop> findAllShopsByAreaId(Long id) {
        return shopDao.findAllByShopId();
        
    }
    
}
