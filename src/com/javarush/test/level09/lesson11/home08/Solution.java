package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
 Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list  = new ArrayList<int[]>();

        int[] five = new int[5];
        five[0] = 1;
        five[1] = 5;
        five[2] = 3;
        five[3] = 6;
        five[4] = 44;

        int[] two = new int[2];
        two[0] = 6;
        two[1] = 4;

        int[] four = new int[4];
        four[0] = 19;
        four[1] = 7;
        four[2] = 335;
        four[3] = 4;

        int[] seven = new int[7];
        seven[0] = 1;
        seven[1] = 5;
        seven[2] = 3;
        seven[3] = 6;
        seven[4] = 44;

        int[] zero = new int[0];


        list.add(five);
        list.add(two);
        list.add(four);
        list.add(seven);
        list.add(zero);

        return list;//Написать тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
