package com.akrotov.aocparser.models.equipment;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Jewel {

    private String name;
    private Stone stone;
    private Integer level;


    public enum Stone {

        Amethyst, Diamond, Emerald, Ruby, Sapphire;

        public static Stone get (String name) {
            return Stone.valueOf(name);
        }
    }
}