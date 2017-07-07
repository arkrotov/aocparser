package com.akrotov.aocparser.models;

import com.akrotov.aocparser.readers.HTTPReader;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
public class Ae {

    private String principalityName;
    private String owner;
    private String name;
    private String type;
    private Date date;
    List<Person> persons;

    public Ae() {
    }

    public enum Type {
        Farm, Village, VillageS, Town;

        public static Type select(String name) {
            switch (name) {
                case "1":
                    return Farm;
                case "2":
                    return Village;
                case "3":
                    return VillageS;
                case "4":
                    return Town;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

    public static void main(String[] args) {
    }

}