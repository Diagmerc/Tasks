package com.javarush.task.pro.task15.task1526;

import java.io.*;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileReader reader = new FileReader(scanner.nextLine())
        ) {
            while (reader.ready()) {
                char ch = (char) reader.read();
                if (ch != ' ' && ch != '.' && ch != ',') {
                    System.out.print(ch);
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong" + e);
        }
    }
}