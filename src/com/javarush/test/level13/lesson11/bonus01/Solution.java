package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader1=new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String line = reader1.readLine();
        while(line != null){
            int n= Integer.parseInt(line);
            if (n%2==0){
                list.add(n);
            }
//            System.out.println(line);
            line = reader1.readLine();
        }

        reader1.close();
        reader.close();

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));

        }// напишите тут ваш код
    }
}
