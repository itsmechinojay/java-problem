package com.accenture.democode.day8;

import java.io.*;

public class FileReading {

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

        System.out.println("File exists: " + file.getAbsolutePath());

        /*
         Exception handling in Java
            1) try-catch block
            2) throws method signature
         */

//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
//
//            StringBuilder builder = new StringBuilder();
//
//            String line;
//            while ((line=reader.readLine()) != null) {
//                if (line != null) {
//                    builder.append(line).append("\n");
//                }
//            }
////            do {
////                line = reader.readLine();
////                if (line != null) {
////                    builder.append(line).append("\n");
////                }
////            } while (line != null);
//
//            System.out.println(builder.toString());
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found: " + e.getMessage());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }\

        try {
            String content = readFile(filename);

            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readFile(String filename) throws IOException {
        // Create a File object
        File file = new File(filename);

        // check if file exists
        if (!file.exists()) {
            System.out.println("File does not exists: " + filename);
            return null;
        }

        FileReader fileReader = new FileReader(file);

        BufferedReader reader = new BufferedReader(fileReader);

        StringBuilder builder = new StringBuilder();

        String line;
        while ((line=reader.readLine()) != null) {
            if (line != null) {
                builder.append(line).append("\n");
            }
        }
//            do {
//                line = reader.readLine();
//                if (line != null) {
//                    builder.append(line).append("\n");
//                }
//            } while (line != null);

        reader.close();

        return builder.toString();
    }

}
