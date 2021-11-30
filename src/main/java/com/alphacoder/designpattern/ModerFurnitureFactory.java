package com.alphacoder.designpattern;

public class ModerFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModerChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModerSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
