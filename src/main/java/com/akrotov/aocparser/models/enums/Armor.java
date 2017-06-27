package com.akrotov.aocparser.models.enums;

public enum Armor {
    Cloak, Jacket, Vest, SamuraiCloak;

    public static Armor select (String name) {
        switch (name) {
            case "withTip armor-plating  item_155" : return Cloak;
            case "withTip armor-plating  item_156" : return Jacket;
            case "withTip armor-plating  item_157" : return Vest;
            case "withTip armor-plating  item_219" : return SamuraiCloak;
            default: throw new IllegalArgumentException();
        }
    }

    public static Armor selectFromDB (String name) {
        try {
            switch (name) {
                case "Cloak": return Cloak;
                case "Jacket": return Jacket;
                case "Vest": return Vest;
                case "SamuraiCloak": return SamuraiCloak;
                default: return null;
            }
        } catch (NullPointerException e) {
        return null;
    }
    }
}
