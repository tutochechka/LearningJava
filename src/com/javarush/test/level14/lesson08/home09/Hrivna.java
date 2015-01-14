package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Sveta on 12/26/14.
 */
public class Hrivna extends Money
{
    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "HRN";
    }
}
