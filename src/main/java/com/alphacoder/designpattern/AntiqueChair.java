package com.alphacoder.designpattern;

public class AntiqueChair implements Chair{
    private final String DESCRIPTION= "This is antique chair";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
