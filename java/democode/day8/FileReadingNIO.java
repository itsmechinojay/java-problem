package com.accenture.democode.day8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/*
Java NIO
- introduced in Java 8
 */
public class FileReadingNIO {

    public static void main(String[] args) {

        // absolute path
        String filename = "C:\\Users\\jeremy.a.argosino\\Desktop\\java-bootcamp\\java-demo-codes-fy21.03\\files\\programming-languages.txt";

        // relative path
        filename = "./files/programming-languages.txt";

        // Create a File object
        File file = new File(filename);

        // check if file exists
        if (!file.exists()) {
            System.out.println("File does not exists: " + filename);
            return;
        }

        try {
            List<String> lines = Files.readAllLines(file.toPath());

            for(String line: lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
