package com.alphacoder.designpattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FurnitureShop {
    private Chair chair;
    private Sofa sofa;
    private Table table;

    public static class FactoryMaker {
        public enum FurnitureShopType{
            MODERN,
            ANTIQUE;
        }

        public static FurnitureFactory makeFactory(FurnitureShopType type) {
            switch (type) {
                case MODERN:
                    return new ModerFurnitureFactory();
                case ANTIQUE:
                    return new AntiqueFurnitureCreator();
                default:
                    throw new IllegalArgumentException("Furniture shop not supported.");
            }
        }
    }
}
