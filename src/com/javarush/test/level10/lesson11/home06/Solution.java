package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        int height;
        int weight;
        boolean sex;
        Human child;

        public Human (String name){}
        public Human (String name, int age){}
        public Human (String name, int age, boolean sex){}
        public Human (String name, Human child){}
        public Human (String name, int age, int height, int weight){}
        public Human (String name, int age, Human child){}
        public Human (String name, int age, boolean sex, Human child){}
        public Human (String name, int age, boolean sex, int height, int weight){}
        public Human (String name, int age, boolean sex, int weight){}
        public Human (String name, boolean sex){}


        //напишите тут ваши переменные и конструкторы
    }
}
