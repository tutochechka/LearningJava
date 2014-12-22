 package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }


        HashMap<Character, Integer> duplicates = new HashMap<Character, Integer>();

        for (Character a: alphabet)
        {
           duplicates.put(a, 0);
        }

        ArrayList<Character> chars = new ArrayList<Character>();

        for (String word: list)
        {
            for (char c : word.toCharArray()) {
                chars.add(c);
            }
        }

        for (Map.Entry<Character, Integer> entry: duplicates.entrySet())
        {
            for (Character ch: chars)
            {
                if (entry.getKey().equals(ch))
                {
                    entry.setValue(entry.getValue() + 1);
                }
            }

        }

        for (Character letter: alphabet)
        {
            for (Map.Entry<Character, Integer> entry: duplicates.entrySet())
            {
                if (entry.getKey().equals(letter))
                {
                    System.out.println(letter + " " + entry.getValue());
                }

            }
        }
    }

}
