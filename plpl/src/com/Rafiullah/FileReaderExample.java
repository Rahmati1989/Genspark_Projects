package com.Rafiullah;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample
{
    public static void main(String[] args) throws IOException
    {
        String fileName = "demo.txt";

        FileReader fileReader = new FileReader(fileName);

        try {
            char [] a = new char[2048];
            fileReader.read(a);
            int counter = 0;

            for(char c : a) {
              counter++;
                System.out.println("a\n"+ "sssss");
                System.out.print(c);
            }
        } finally {
            fileReader.close();
        }
    }
}