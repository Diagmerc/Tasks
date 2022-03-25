package com.javarush.task.pro.task14.task1417;

/* 
Валидатор даты
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи дату в формате dd.mm.yyyy : ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nДата корректна.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {
        //напишите тут ваш код
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            Date dat = formatter.parse(date);
        } catch (InvalidDateFormatException) {
            throw new InvalidDateFormatException;
        }

    }

    public static void checkYearValue(String date) {
        //напишите тут ваш код
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try{
            Date dat = formatter.parse(date);
            int dateDate = dat.getYear();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void checkMonthValue(String date) {
        //напишите тут ваш код
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        try{
            Date dat = formatter.parse(date);
            //возвращает месяц при отсчете с 0, поэтому прибавляем 1.
            int dateDate = dat.getMonth() + 1;
            if (dateDate > 12 || dateDate < 1){

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>(){{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        //напишите тут ваш код
    }
}
