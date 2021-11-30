package com.alphacoder.designpattern;

public class AntiqueSofa implements Sofa{
    private final String DESCRIPTION= "This is antique sofa";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
