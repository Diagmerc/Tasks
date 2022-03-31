package com.javarush.task.pro.task15.task1532;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* 
Шифр
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = message.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < buffer.length / 2; i++) {
            byteArrayOutputStream.write(buffer[i]);
            byteArrayOutputStream.write(buffer[buffer.length - i - 1]);
        }
        if(buffer.length % 2 == 1){
            byteArrayOutputStream.write(buffer[buffer.length/2]);
        }
        
        return byteArrayOutputStream;
    }
}
