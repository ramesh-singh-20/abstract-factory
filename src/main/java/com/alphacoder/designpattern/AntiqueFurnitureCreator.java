package com.alphacoder.designpattern;

public class AntiqueFurnitureCreator implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new AntiqueChair();
    }

    @Override
    public Sofa createSofa() {
        return new AntiqueSofa();
    }

    @Override
    public Table createTable() {
        return new AntiqueTable();
    }
}
