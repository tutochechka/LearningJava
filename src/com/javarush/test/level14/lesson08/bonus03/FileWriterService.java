package com.javarush.test.level14.lesson08.bonus03;

public class FileWriterService
{
    private static FileWriterService _instance;

    protected FileWriterService(){
    }

    public static FileWriterService getInstance()
    {
        if (_instance == null){
            _instance = new FileWriterService();
        }

        return _instance;
    }

    public void WriteToFile(String fileName, String content){
        FilesWritten++;
    }

    public int FilesWritten;
}


