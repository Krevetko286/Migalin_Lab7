package ru.mirea.gibo4.Lab7;

import java.util.LinkedList;

public class LinkedListCollection {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Австрия");
        states.add("Франция");
        states.addLast("Великобритания"); // добавляем на последнее место
        states.addFirst("Норвегия"); // добавляем на первое место
        states.add("Нигерия");
        states.add(1, "Португалия"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания");
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Австрия")){

            System.out.println("Список содержит государство Австрия");
        }

        states.remove("Австрия");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Evgeny"));
        people.addFirst(new Person("Kirill"));
        people.addLast(new Person("Misha"));
        people.remove(1); // удаление второго элемента

        for(Person p : people){

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}