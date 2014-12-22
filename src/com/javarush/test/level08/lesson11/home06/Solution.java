package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human("Tom", 7, true, new ArrayList<Human>());
        Human child2 = new Human("Monica", 15, false, new ArrayList<Human>());
        Human child3 = new Human("Jack", 10, true, new ArrayList<Human>());
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(child1);
        children.add(child2);
        children.add(child3);

        Human mama = new Human("Tiffany", 37, false, children);
        Human papa = new Human("Nick", 38, true, children);
        ArrayList<Human> children1 = new ArrayList<Human>();
        children1.add(mama);
        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(papa);

        Human ded1 = new Human("Albert", 62, true, children1);
        Human baba1 = new Human("Janet", 58, false, children1);

        Human ded2 = new Human("Gregory", 60, true, children2);
        Human baba2 = new Human("Loren", 59, false, children2);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(baba1);
        System.out.println(baba2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);//Написать тут ваш код
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        public Human (String name, int age, Boolean sex, ArrayList<Human> children)
        {
            this.age = age;
            this.children = children;
            this.name = name;
            this.sex = sex;
        }//Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
