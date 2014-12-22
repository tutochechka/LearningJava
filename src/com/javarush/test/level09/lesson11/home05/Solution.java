package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] list = new char[s.length()];
        ArrayList<Character> vowelsList = new ArrayList<Character>();
        ArrayList<Character> otherList = new ArrayList<Character>();

        s.getChars(0,s.length(), list, 0 );

        for (int i = 0; i <s.length(); i++)
        {
            if (isVowel(list[i]))
            {
                vowelsList.add(list[i]);
            }
            else
            if (list[i] != ' ')
            {
                otherList.add(list[i]);
            }

        }

        for (char a: vowelsList)
        {
            System.out.print(a + " ");
        }

        System.out.println();

        for (char a: otherList)
        {
            System.out.print(a + " ");
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
