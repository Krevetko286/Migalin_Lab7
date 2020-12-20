package ru.mirea.gibo4.Lab7;

import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        // добавим в список ряд элементов
        states.add("Австрия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Норвегия");
        states.add("Нигерия");
        states.add(1, "Португалия"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта

        System.out.printf("В списке %d элементов \n", states.size());
        for(String state : states){

            System.out.println(state);
        }

        if(states.contains("Австрия")){

            System.out.println("Список содержит государство Австрия");
        }

        // удалим несколько объектов
        states.remove("Австрия");
        states.remove(0);

        Object[] countries = states.toArray();
        for(Object country : countries){

            System.out.println(country);
        }
    }
}
