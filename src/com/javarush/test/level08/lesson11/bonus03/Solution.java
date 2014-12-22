package com.javarush.test.level08.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/* Задача по алгоритмам
Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.toString(i);
            //array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        Arrays.sort(array, new Comparator<String>()
        {
            @Override
            public int compare(String o1, String o2)
            {
                if (o1.equals(o2)){
                    return 0;
                }

                return isGreaterThen(o1, o2)? 1 : -1;
            }
        });
        //Arrays.sort(array, new MyComparator());
        //Напишите тут ваш код
    }

    public static class MyComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2)
        {
            if (o1.equals(o2)){
                return 0;
            }

            return isGreaterThen(o1, o2)? 1 : -1;
        }
    }

    public static int mini(String[] array){
        int mini = -1;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != null && (mini == -1 || isGreaterThen(array[mini], array[i]))){
                mini = i;
            }
        }

        return mini;
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }
}
