package com.akrotov.aocparser.models.equipment.armor;

public class ArmorService {
    public static Armor getArmor(String name) {
        switch (name) {
            case "withTip armor-plating  item_155" : return new Cloak ("Cloak", 0, 0);
            case "withTip armor-plating  item_156" : return new Jacket ("Jacket",0, 0);
            case "withTip armor-plating  item_157" : return new Vest ("Vest", 0, 0);
            case "withTip armor-plating  item_219" : return new SamuraiCloak ("SamuraiCloak", 0, 0);
            default: throw new IllegalArgumentException();
        }
    }

    // TODO: Смоделировать таблицы в базе так, чтобы учитывалась прочность и защита
    public static Armor getArmorFromDB(String name) {
        try {
            switch (name) {
                case "Cloak":
                    return new Cloak ("Cloak", 0, 0);
                case "Jacket":
                    return new Jacket ("Jacket",0, 0);
                case "Vest":
                    return new Vest ("Vest", 0, 0);
                case "SamuraiCloak":
                    return new SamuraiCloak ("SamuraiCloak", 0, 0);
                default:
                    return null;
            }
        } catch (NullPointerException e) {
            return null;

        }
    }
}
