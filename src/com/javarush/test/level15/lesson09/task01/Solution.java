package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static
    {
        labels.put(3.2, "Hello!");
        labels.put(4.2, "I");
        labels.put(3.6, "am");
        labels.put(5.0, "the");
        labels.put(4.9, "best!");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }

}
