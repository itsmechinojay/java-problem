package com.accenture.democode.day8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileWritingNIO {

    public static void main(String[] args) {

        String filename = "./files/sampleWrite2.txt";
        String content = "hello world";

        try {
            File file = new File(filename);

            if (!file.exists()) {
                Files.write(Paths.get(filename), (content + "\n").getBytes(), StandardOpenOption.CREATE);
            } else {
                Files.write(file.toPath(), (content + "\n").getBytes(), StandardOpenOption.APPEND);
            }

            System.out.println("Content to saved to " + filename);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
