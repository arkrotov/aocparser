package com.akrotov.aocparser.models.equipment.armor;

import java.util.Random;

public class Armor {

    protected String name;
    protected int defence;
    protected int durability;

    private static Random random = new Random();

    public Armor(String name, int defence, int durability) {
        this.name = name;
        this.defence = defence;
        this.durability = durability;
    }

    public int def() {
        return defence;
    }

}
