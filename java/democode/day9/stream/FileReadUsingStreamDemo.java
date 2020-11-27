package com.accenture.democode.day9.stream;

import com.accenture.democode.day8.PL;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReadUsingStreamDemo {

    public static void main(String[] args) {

        String filename = "./files/programming-languages.txt";
        try {
            List<PL> pLanguages = Files.readAllLines(Paths.get(filename)).stream()
                    .map(line -> line.split(","))
                    .map(data -> new PL(Integer.valueOf(data[0]), data[1]))
                    .collect(Collectors.toList());

            System.out.println(pLanguages);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
