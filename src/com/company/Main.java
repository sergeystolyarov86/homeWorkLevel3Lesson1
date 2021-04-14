package com.company;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        String[] arr = {"учусь", "Я", "на", "geekbrains"};
        arrReplaceElement(arr, 1, 0);

        System.out.println("Задание 2: ");

        String[] arr2 = {"изучать", "java", "интерресно",};
        arrToArrayList(arr2);

        System.out.println("Задание 3: ");

        Box<Apple> applesbox = new Box<>();
        Box<Orange> orangesbox = new Box<>();
        Box<Apple> applebox2 = new Box<>();
        Box<Orange> orangesbox2 = new Box<>();

        applesbox.addFruit(new Apple(), 10);
        orangesbox.addFruit(new Orange(), 25);
        applebox2.addFruit(new Apple(), 8);
        orangesbox2.addFruit(new Orange(), 7);

        System.out.println("Вес applesbox коробки с яблоками: " + applesbox.getWeight());
        System.out.println("Вес orangesbox коробки с апельсинми: " + orangesbox.getWeight());

        System.out.println("Сравнение коробок applesbox и orangesbox: " + applesbox.compare(orangesbox));

        applesbox.pourTo(applebox2);

        System.out.println("Bес applebox2 после пересыпания в нее из applebox: " + applebox2.getWeight());


    }

    static <T> void arrReplaceElement(T arr[], int i, int j) {
        T buff = null;
        buff = arr[i];
        arr[i] = arr[j];
        arr[j] = buff;
        System.out.println(Arrays.toString(arr));
    }


    static <T> void arrToArrayList(T[] arr) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);

    }
}



