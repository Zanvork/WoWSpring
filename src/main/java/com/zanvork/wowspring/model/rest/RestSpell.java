package com.zanvork.wowspring.model.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestSpell {
    private long id;
    private String name;
    private String icon;
    private String description;
    private String range;
    private String powerCost;
    private String castTime;
    private String cooldown;
}
