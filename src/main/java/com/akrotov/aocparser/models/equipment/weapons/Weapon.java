package com.akrotov.aocparser.models.equipment.weapons;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Weapon implements Attack{

    protected String name;
    protected int minDmg;
    protected int maxDmg;
    protected int durability;
    protected int amountOfShots;
    protected int accuracy;

}
