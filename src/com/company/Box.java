package com.company;

import java.util.ArrayList;


public class Box<T extends Fruit> {
    private ArrayList<T> fruitbox = new ArrayList<>();


    public float getWeight() {
        float weight = 0.0f;
        for (T o : fruitbox) {
            weight += o.getWeight();
        }
        return weight;
    }


    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruitbox.add(fruit);
        }
    }

    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void pourTo(Box<T> anotherBox) {
        anotherBox.fruitbox.addAll(fruitbox);
        fruitbox.clear();
    }
}
