package com.akrotov.aocparser.models.enums;

public enum Type {
    Farm, Village, VillageS, Town;

    public static Type select (String name) {
        switch (name) {
            case "1" : return Farm;
            case "2" : return Village;
            case "3" : return VillageS;
            case "4": return Town;
            default: throw new IllegalArgumentException();
        }
    }


}
