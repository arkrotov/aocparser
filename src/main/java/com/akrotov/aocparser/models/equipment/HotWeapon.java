package com.akrotov.aocparser.models.equipment;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Random;

/**
 * Created by me on 28.06.17.
 */

// TODO: Константы засоряют память

@EqualsAndHashCode(callSuper = true)
@Data
public class HotWeapon extends Weapon {

    protected int amountOfCartridges;

    private static Random random = new Random();

    public HotWeapon(String name, int minDmg, int maxDmg, int durability, int amountOfShots, int accuracy, int amountOfCartridges) {
            super(name, minDmg, maxDmg, durability, amountOfShots, accuracy);
            this.amountOfCartridges = amountOfCartridges;
    }

    @Override
    public int attack() {

        int dmg = 0;

        for (int i = 0; i < amountOfShots; i++) {
            dmg = amountOfCartridges != 0 ? random.nextInt(maxDmg-minDmg) + minDmg : 0;
        }

        return dmg;
    }
}
