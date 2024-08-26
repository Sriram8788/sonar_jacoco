package com.example.market;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

public class FruitMarketTest {

    @Test
    public void testAddAndGetFruit() {
        FruitMarket market = new FruitMarket();
        market.addFruit("Pineapple", 1.5);
        double price = market.getPrice("Pineapple");
        assertEquals(1.5, price, "Price of Pineapple should be 1.5");
    }

    @Test
    public void testRemoveFruit() {
        FruitMarket market = new FruitMarket();
        market.removeFruit("Apple");
        double price = market.getPrice("Apple");
        assertEquals(0.0, price, "Price of removed Apple should be 0.0");
    }

    @Test
    public void testGetAllFruits() {
        FruitMarket market = new FruitMarket();
        Map<String, Double> fruits = market.getAllFruits();
        assertTrue(fruits.containsKey("Apple"), "Fruits should contain Apple");
        assertTrue(fruits.containsKey("Banana"), "Fruits should contain Banana");
        assertTrue(fruits.containsKey("Orange"), "Fruits should contain Orange");
    }
}
