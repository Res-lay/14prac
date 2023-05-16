package com.example.demo;

import javax.script.ScriptEngine;

public class Team {
    private String name;
    private String creationDate;

    public String getCreationDate() {
        return creationDate;
    }

    public String getName() {
        return name;
    }

    Team(String name, String creationDate){
        this.creationDate = creationDate;
        this.name = name;
    }
}
