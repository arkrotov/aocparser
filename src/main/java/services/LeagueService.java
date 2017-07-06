package services;


import com.akrotov.aocparser.models.equipment.League;

public class LeagueService {

    //  , II, III, IV, V, VI, VII, VIII, IX, X, GOLD_I, GOLD_II, GOLD_III;
    public static League select (String name){
        switch (name) {
            case "военного дела от 0" : return new League("I");
            case "военного дела от 500" : return new League("II");
            case "военного дела от 1 000" : return new League("III");
            case "военного дела от 1 500" : return new League("IV");
            case "военного дела от 3 000" : return new League("V");
            case "военного дела от 7 000" : return new League("VI");
            case "военного дела от 12 000" : return new League("VII");
            case "военного дела от 20 000" : return new League("VIII");
            case "военного дела от 30 000" : return new League("IX");
            case "военного дела от 50 000" : return new League("X");
            case "военного дела от 100 000" : return new League("GOLD_I");
            case "военного дела от 150 000" : return new League("GOLD_II");
            case "военного дела от 250 000" : return new League("GOLD_III");
            default: throw new IllegalArgumentException();
        }
    }

    public static League selectFromDB (String name) {
        switch (name) {
            case "I" : return new League("I");
            case "II" : return new League("II");
            case "III" : return new League("III");
            case "IV" : return new League("IV");
            case "V" : return new League("V");
            case "VI" : return new League("VI");
            case "VII" : return new League("VII");
            case "VIII" : return new League("VIII");
            case "IX" : return new League("IX");
            case "X" : return new League("X");
            case "GOLD_I" : return new League("GOLD_I");
            case "GOLD_II" : return new League("GOLD_II");
            case "GOLD_III" : return new League("GOLD_III");
            default: throw new IllegalArgumentException();
        }
    }
}
