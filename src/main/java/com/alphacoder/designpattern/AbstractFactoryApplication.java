package com.alphacoder.designpattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AbstractFactoryApplication implements Runnable{
	private final FurnitureShop furnitureShop= new FurnitureShop();

	public FurnitureShop getFurnitureShop() {
		return furnitureShop;
	}
	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);
		AbstractFactoryApplication app= new AbstractFactoryApplication();
		app.run();

	}

	@Override
	public void run() {
		log.info("Modern Furniture Shop");
		createFurnitureShop(FurnitureShop.FactoryMaker.FurnitureShopType.MODERN);
		log.info(furnitureShop.getChair().getDescription());
		log.info(furnitureShop.getSofa().getDescription());
		log.info(furnitureShop.getTable().getDescription());

		log.info("Antique Furniture Shop");
		createFurnitureShop(FurnitureShop.FactoryMaker.FurnitureShopType.ANTIQUE);
		log.info(furnitureShop.getChair().getDescription());
		log.info(furnitureShop.getSofa().getDescription());
		log.info(furnitureShop.getTable().getDescription());
	}


	public void createFurnitureShop(final FurnitureShop.FactoryMaker.FurnitureShopType furnitureShopType) {
		final FurnitureFactory furnitureFactory = FurnitureShop.FactoryMaker.makeFactory(furnitureShopType);
		furnitureShop.setChair(furnitureFactory.createChair());
		furnitureShop.setSofa(furnitureFactory.createSofa());
		furnitureShop.setTable(furnitureFactory.createTable());
	}
}
