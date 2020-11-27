package com.accenture.democode.day8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadAndParseFile {

    public static void main(String[] args) {

        String filename = "./files/programming-languages.txt";
        try {
            List<PL> languages = readFile(filename);

            System.out.println(languages);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PL> readFile(String filename) throws IOException {

        // read as string
        List<String> lines = Files.readAllLines(Paths.get(filename));

        // parse string -> PL object
        // "1,Java" -> new PL(1, "Java")

        List<PL> programmingLanguages = new ArrayList<>();

        for(String line : lines) {
            String[] data = line.split(",");

            int id = Integer.valueOf(data[0]);
            String langauge = data[1];

            PL pl = new PL(id, langauge);
            programmingLanguages.add(pl);
        }

        return programmingLanguages;
    }
}
