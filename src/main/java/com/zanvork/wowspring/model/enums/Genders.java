/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zanvork.wowspring.model.enums;

/**
 *
 * @author jgreeman
 */
public enum Genders {
    MALE,
    FEMALE;
    
    public static Genders genderFromInt(int value){
        if (value > 1) value = 0;
        return Genders.values()[value];
    }
}
