package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Sveta on 12/26/14.
 */
public class UkrainianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 30;
    }
    @Override
    public String getDescription()
    {
        String s = super.getDescription();
        String m = Country.UKRAINE;
        String n = String.valueOf(getCountOfEggsPerMonth());

        return s + " Моя страна - " + m + ". Я несу " + n + " яиц в месяц.";
    }
}
