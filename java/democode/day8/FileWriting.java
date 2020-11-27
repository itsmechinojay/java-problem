package com.accenture.democode.day8;

import java.io.*;

public class FileWriting {

    public static void main(String[] args) {

        String filename = "./files/sampleWrite.txt";
        String content = "hello world";

        try {
            // save List<PL>
            // List<PL> -> string
            // save string to file

            writeFile(filename, content, true);
            System.out.println("Content saved to " + filename);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public static void writeFile(String filename, String content, boolean isAppend) throws IOException {

        File file = new File(filename);
        FileWriter fileWriter = new FileWriter(file, isAppend);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(content);
        writer.write("\n");
        writer.close();
    }

}
