package com.example.market;

import java.util.HashMap;
import java.util.Map;

public class FruitMarket {
    private Map<String, Double> fruitPrices;

    public FruitMarket() {
        fruitPrices = new HashMap<>();
        // Initializing with some fruits and their prices
        fruitPrices.put("Apple", 1.0);
        fruitPrices.put("Banana", 0.5);
        fruitPrices.put("Orange", 0.75);
    }

    public void addFruit(String fruit, double price) {
        fruitPrices.put(fruit, price);
    }

    public void removeFruit(String fruit) {
        fruitPrices.remove(fruit);
    }

    public double getPrice(String fruit) {
        return fruitPrices.getOrDefault(fruit, 0.0);
    }

    public Map<String, Double> getAllFruits() {
        return new HashMap<>(fruitPrices);
    }
}
