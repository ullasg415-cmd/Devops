package com.example;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // Simple List (modifiable)
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits);

        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destFile);
        ) {
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
