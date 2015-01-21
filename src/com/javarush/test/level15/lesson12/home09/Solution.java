package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//add your code here
        String url = reader.readLine();

        url = url.substring(url.indexOf('?')+1);

        for (String retval: url.split("&"))
        {
            System.out.print(((retval.contains("="))?retval.substring(0,retval.indexOf('=')):retval)+" ");
        }
        System.out.println();

        for (String retval: url.split("&"))
        {
            String value, param = (retval.contains("="))?retval.substring(0,retval.indexOf('=')):retval;
            if (param.equals("obj")){
                Double d;
                value=(retval.contains("="))?retval.substring(retval.indexOf('=')+1):"";
                try{
                    d = Double.parseDouble(value);
                    alert(d);
                }
                catch (Exception e){
                    alert(value);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
