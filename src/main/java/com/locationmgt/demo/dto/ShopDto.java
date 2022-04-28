/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.locationmgt.demo.dto;

import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author nashey
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShopDto {
    private long areaId;
    private String name;
    private String address;
    
}
