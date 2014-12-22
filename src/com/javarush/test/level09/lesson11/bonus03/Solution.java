package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();


        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<String> StringList = new ArrayList<String>();
        ArrayList<Integer> IntegerList = new ArrayList<Integer>();
        ArrayList<Integer> IntegerList1 = new ArrayList<Integer>();
        ArrayList<Boolean> flag = new ArrayList<Boolean>();

        for (String a: array)
        {
            try
            {
                int m = Integer.parseInt(a);
                IntegerList.add(m);
                flag.add(true);//Напишите тут ваш код
            }
            catch (NumberFormatException e)
            {
                StringList.add(a);
                flag.add(false);
            }

        }

        java.util.Collections.sort(StringList);

        java.util.Collections.sort(IntegerList);
        for (int i = 0; i < IntegerList.size(); i++)
        {
            IntegerList1.add(IntegerList.get(IntegerList.size()-i-1));
        }


        int intCount = 0;
        int strCount = 0;

        for (int i = 0; i < flag.size(); i++)
        {
            if (flag.get(i) == true)
            {
                array[i] = IntegerList1.get(intCount).toString();
                intCount ++;
            }
            else
            {
                array[i] = StringList.get(strCount);
                strCount ++;
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        for (char c : s.toCharArray())
        {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}
