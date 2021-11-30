package com.alphacoder.designpattern;

public class AntiqueTable implements Table{
    private final String DESCRIPTION= "This is antique table";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
