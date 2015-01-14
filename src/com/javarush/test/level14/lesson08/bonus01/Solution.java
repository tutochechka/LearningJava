package com.javarush.test.level14.lesson08.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.zip.DataFormatException;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        String s = "2s";
        try
        {

            int m = Integer.parseInt(s);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        int[] list = new int[3];
        try
        {
            System.out.println(list[4]);


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        String m = null;
        try
        {
            System.out.println(m.toString());


        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            new FileReader("c:\\somenotvalidfile.txt");

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] a = new int[-5];
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String ss = "asdasd";
            ss.charAt(50);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

            throw new DataFormatException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

            throw new NoSuchElementException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

            throw new InvalidKeyException();

        } catch (Exception e)
        {
            exceptions.add(e);
        }//Add your code here

    }

}
