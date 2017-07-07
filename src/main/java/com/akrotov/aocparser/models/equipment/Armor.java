package com.akrotov.aocparser.models.equipment;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Armor implements Defence {

    private String name;
    private int defence;
    private int durability;

    public int defence() {
        return defence;
    }

}
