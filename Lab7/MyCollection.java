package ru.mirea.gibo4.Lab7;

import java.util.*;

public class MyCollection {
    public static void main(String args[]) {

        AbstractList<String>
                list = new LinkedList<String>();

        list.add("Brother");
        list.add("Sister");
        list.add("2000");
        list.add("2001");

        System.out.println("AbstractList: " + list);
    }
}