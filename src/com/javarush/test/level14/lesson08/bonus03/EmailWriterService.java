package com.javarush.test.level14.lesson08.bonus03;

public class EmailWriterService extends FileWriterService {

    protected EmailWriterService()
    {
        super();
    }

    @Override
    public void WriteToFile(String fileName, String content){
        EmailsSent++;
    }

    public int EmailsSent;

}
