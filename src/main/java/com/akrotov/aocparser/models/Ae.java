package com.akrotov.aocparser.models;

import com.akrotov.aocparser.models.enums.Type;
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

}