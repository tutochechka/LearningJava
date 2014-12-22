package com.javarush.test.level09.lesson06.task01;

/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        try
        {//Напишите тут ваш код

         int a = 42/0;
        }

        catch (ArithmeticException e)
        {
            String s = e.getMessage();
            System.out.println("ArithmeticException" + s);
        }


        //Напишите тут ваш код

    }
}
