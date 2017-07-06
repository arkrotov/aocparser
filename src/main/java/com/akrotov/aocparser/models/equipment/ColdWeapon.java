package com.akrotov.aocparser.models.equipment;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Random;

@EqualsAndHashCode(callSuper = true)
@Data
public class ColdWeapon extends Weapon {

    private static Random random = new Random();

    public ColdWeapon(String name, int minDmg, int maxDmg, int durability, int amountOfShots, int accuracy) {
        super(name, minDmg, maxDmg, durability, amountOfShots, accuracy);
    }

    @Override
    public int attack() {

        int dmg = 0;

        for (int i = 0; i < amountOfShots; i++) {
            dmg = random.nextInt(maxDmg-minDmg) + minDmg;
        }

        return dmg;
    }
}
