package com.javarush.test.level14.lesson08.bonus03;

/* FileWriterService
Класс является синглтоном (реализует паттерн(шаблон) FileWriterService), если позволяет создать всего один объект своего типа.

Реализовать FileWriterService pattern:
1. Создай класс FileWriterService в отдельном файле.
2. Добавь в него статический метод getInstance().
3. Метод getInstance должен возвращать один и тот же объект класса FileWriterService при любом вызове метода getInstance.
4. Подумай, каким образом можно запретить создание других объектов этого класса.
5. Сделай все конструкторы в классе FileWriterService приватными (private).

6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getInstance.
*/
public class Solution
{
    public static void main(String[] args)
    {
        FileWriterService instance = FileWriterService.getInstance();
        instance.WriteToFile("readme.txt", "Hello world");
        FileWriterService.getInstance().WriteToFile("readme.txt", "Hello world");

        FileWriterServiceStatic.WriteToFile("readme.txt", "Hello world");
        Process(EmailWriterService.getInstance());
    }

    public static void Process(FileWriterService fileWriter){
        fileWriter.WriteToFile("readme.txt", "Hello world");
    }

    public static void Process2(){
    }
}
