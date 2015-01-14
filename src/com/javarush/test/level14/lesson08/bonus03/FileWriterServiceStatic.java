package com.javarush.test.level14.lesson08.bonus03;

public /*static */class FileWriterServiceStatic
{
    public static void WriteToFile(String fileName, String content){
        FilesWritten++;
    }

    public static int FilesWritten;
}
