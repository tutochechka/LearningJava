package com.javarush.test.level13.lesson11.bonus02;

public class Person implements RepkaItem
{
    private String name;
    private String namePadezh;

    public Person(String name, String namePadezh)
    {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    public String pull(Person person)
    {
        System.out.println( this.name + " за " + person.getNamePadezh());
        return this.name + " за " + person.getNamePadezh();
    }

    @Override
    public String getNamePadezh()
    {
        return namePadezh;
    }
}

/* Репка
Сказка Репка:
1. <> Реализовать интерфейс RepkaItem в классе Person.
2. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
3. Исправить логическую ошибку цикла в методе tell класса RepkaStory.
4. Выполнить метод main и наслаждаться сказкой!
*/
