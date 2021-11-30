package com.alphacoder.designpattern;

public class ModernTable implements Table{
    private final String DESCRIPTION= "This is modern table";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
