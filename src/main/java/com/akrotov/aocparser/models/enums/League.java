package com.akrotov.aocparser.models.enums;

public enum League {
    I, II, III, IV, V, VI, VII, VIII, IX, X, GOLD_I, GOLD_II, GOLD_III;

    public static League select (String name){
        switch (name) {
            case "военного дела от 0" : return I;
            case "военного дела от 500" : return II;
            case "военного дела от 1 000" : return III;
            case "военного дела от 1 500" : return IV;
            case "военного дела от 3 000" : return V;
            case "военного дела от 7 000" : return VI;
            case "военного дела от 12 000" : return VII;
            case "военного дела от 20 000" : return VIII;
            case "военного дела от 30 000" : return IX;
            case "военного дела от 50 000" : return X;
            case "военного дела от 100 000" : return GOLD_I;
            case "военного дела от 150 000" : return GOLD_II;
            case "военного дела от 250 000" : return GOLD_III;
            default: throw new IllegalArgumentException();
        }
    }

    public static League selectFromDB (String name) {
        switch (name) {
            case "I" : return I;
            case "II" : return II;
            case "III" : return III;
            case "IV" : return IV;
            case "V" : return V;
            case "VI" : return VI;
            case "VII" : return VII;
            case "VIII" : return VIII;
            case "IX" : return IX;
            case "X" : return X;
            case "GOLD_I" : return GOLD_I;
            case "GOLD_II" : return GOLD_II;
            case "GOLD_III" : return GOLD_III;
            default: throw new IllegalArgumentException();
        }
    }
}


