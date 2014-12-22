package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> cats = new HashMap<String, Cat>();

        cats.put("One", new Cat("One"));
        cats.put("Two", new Cat("Two"));
        cats.put("Three", new Cat("Three"));
        cats.put("Four", new Cat("Four"));
        cats.put("Five", new Cat("Five"));
        cats.put("Six", new Cat("Six"));
        cats.put("Seven", new Cat("Seven"));
        cats.put("Eight", new Cat("Eight"));
        cats.put("Nine", new Cat("Nine"));
        cats.put("Ten", new Cat("Ten"));

        return  cats;//Напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> set = new HashSet<Cat>(map.values());
        return  set;//Напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
