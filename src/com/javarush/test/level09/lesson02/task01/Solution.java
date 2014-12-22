package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        method2();

        StackTraceElement[] StackTraceElements1 = Thread.currentThread().getStackTrace();
        return StackTraceElements1;//Напишите тут ваш код

    }

    public static StackTraceElement[] method2()
    {
        method3();

        StackTraceElement[] StackTraceElements2 = Thread.currentThread().getStackTrace();
        return StackTraceElements2;//Напишите тут ваш код

    }

    public static StackTraceElement[] method3()
    {
        method4();

        StackTraceElement[] StackTraceElements3 = Thread.currentThread().getStackTrace();
        return StackTraceElements3;//Напишите тут ваш код

    }

    public static StackTraceElement[] method4()
    {
        method5();

        StackTraceElement[] StackTraceElements4 = Thread.currentThread().getStackTrace();
        return StackTraceElements4;//Напишите тут ваш код

    }

    public static StackTraceElement[] method5()
    {

        StackTraceElement[] StackTraceElements5 = Thread.currentThread().getStackTrace();
        return StackTraceElements5;//Напишите тут ваш код

    }
}
