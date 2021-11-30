package com.alphacoder.designpattern;

public class ModerChair implements Chair{
    private final String DESCRIPTION= "This is modern chair";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
