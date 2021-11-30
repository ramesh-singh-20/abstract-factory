package com.alphacoder.designpattern;

public class ModerSofa implements Sofa{
    private final String DESCRIPTION= "This is modern sofa";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
