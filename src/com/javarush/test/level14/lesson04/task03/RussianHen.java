package com.javarush.test.level14.lesson04.task03;

import com.javarush.test.level14.lesson06.home01.Country;

/**
 * Created by Sveta on 12/22/14.
 */
public class RussianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 15;
    }

    @Override
    public String getDescription()
    {
        return super.getDescription()  + " Моя страна - "+ Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
