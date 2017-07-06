package com.akrotov.aocparser.models.equipment.jewels;


import com.akrotov.aocparser.models.equipment.jewels.other.DiamondBelt;
import com.akrotov.aocparser.models.equipment.jewels.other.DiamondVest;

public abstract class Jewel {

    protected Integer level;
    protected Stone stone;

    public Jewel(Integer level, Stone stone) {
        this.level = level;
        this.stone = stone;
    }

    public static Jewel select(String s) {

        switch (s) {

            // ----------------Перевязь------------------
            case "withTip accessory-baldric  item_158":
                return new Grasp(0, Stone.Sapphire);
            case "withTip accessory-baldric  item_178":
                return new Grasp(1, Stone.Sapphire);
            case "withTip accessory-baldric  item_179":
                return new Grasp(2, Stone.Sapphire);
            case "withTip accessory-baldric  item_180":
                return new Grasp(3, Stone.Sapphire);

            case "withTip accessory-baldric  item_159":
                new Grasp(0, Stone.Amethyst);
            case "withTip accessory-baldric  item_181":
                new Grasp(1, Stone.Amethyst);
            case "withTip accessory-baldric  item_182":
                new Grasp(2, Stone.Amethyst);
            case "withTip accessory-baldric  item_183":
                new Grasp(3, Stone.Amethyst);

            case "withTip accessory-baldric  item_160":
                new Grasp(0, Stone.Ruby);
            case "withTip accessory-baldric  item_184":
                new Grasp(1, Stone.Ruby);
            case "withTip accessory-baldric  item_185":
                new Grasp(2, Stone.Ruby);
            case "withTip accessory-baldric  item_186":
                new Grasp(3, Stone.Ruby);

            case "withTip accessory-baldric  item_161":
                new Grasp(0, Stone.Emerald);
            case "withTip accessory-baldric  item_187":
                new Grasp(1, Stone.Emerald);
            case "withTip accessory-baldric  item_188":
                new Grasp(2, Stone.Emerald);
            case "withTip accessory-baldric  item_189":
                new Grasp(3, Stone.Emerald);

            case "withTip accessory-baldric  item_162":
                new Grasp(0, Stone.Diamond);
            case "withTip accessory-baldric  item_190":
                new Grasp(1, Stone.Diamond);
            case "withTip accessory-baldric  item_191":
                new Grasp(2, Stone.Diamond);
            case "withTip accessory-baldric  item_192":
                new Grasp(3, Stone.Diamond);

            // ---------------Алмазная жилетка------------------
            case "withTip accessory-baldric  item_209":
                return new DiamondVest(1, null);
            case "withTip accessory-baldric  item_210":
                return new DiamondVest(2, null);
            case "withTip accessory-baldric  item_211":
                return new DiamondVest(3, null);
            case "withTip accessory-baldric  item_212":
                return new DiamondVest(4, null);
            case "withTip accessory-baldric  item_213":
                return new DiamondVest(5, null);

            // ---------------Алмазный пояс-----------------
            case "withTip accessory-belt  item_214":
                return new DiamondBelt(1, null);
            case "withTip accessory-belt  item_215":
                return new DiamondBelt(2, null);
            case "withTip accessory-belt  item_216":
                return new DiamondBelt(3, null);
            case "withTip accessory-belt  item_217":
                return new DiamondBelt(4, null);
            case "withTip accessory-belt  item_218":
                return new DiamondBelt(5, null);

            default:
                throw new IllegalArgumentException();
        }
    }
}
