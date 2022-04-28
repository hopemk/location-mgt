/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.demo.controller;

import com.locationmgt.demo.dto.ShopDto;
import com.locationmgt.demo.service.ShopService;
import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nashey
 */
@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;
    @PostMapping("shop/save")
    public String save(@RequestBody ShopDto shopDto) throws ParseException{
        String response = shopService.saveShop(shopDto);
        return response;
    }
}
