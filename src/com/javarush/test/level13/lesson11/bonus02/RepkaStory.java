package com.javarush.test.level13.lesson11.bonus02;

import java.util.List;

public class RepkaStory
{
    static void tell(List<Person> items) {

        Person first;
        Person second;
        for (int i = items.size() - 1; i > 0; i--) {
            first = items.get(i);
            second = items.get(i-1);
            first.pull(second);
        }
    }
}

/* Репка
Сказка Репка:
1. <> Реализовать интерфейс RepkaItem в классе Person.
2. <> В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
      Бабка за Дедку
      Дедка за Репку
3. Исправить логическую ошибку цикла в методе tell класса RepkaStory.
4. Выполнить метод main и наслаждаться сказкой!
*/