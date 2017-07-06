package com.akrotov.aocparser.models.equipment.jewels;

/**
 * Created by me on 27.06.17.
 */
public enum Stone {
    Amethyst, Diamond, Emerald, Ruby, Sapphire;

    public static Stone get (String name) {
        return Stone.valueOf(name);
    }

}
