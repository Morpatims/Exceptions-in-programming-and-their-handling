package com.example.userinfoapp.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExtractor {

    public static String extractString(String input) throws InputDataException {
        if (input.matches("[a-zA-Zа-яА-Я]+")) {
            return input;
        } else {
            throw new InputDataException("Неверный формат строки: " + input);
        }
    }

    public static String extractDate(String input) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);

        Date date = dateFormat.parse(input);
        return dateFormat.format(date);
    }

    public static long extractPhoneNumber(String input) throws InputDataException {
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            throw new InputDataException("Неверный формат номера телефона: " + input);
        }
    }

    public static char extractGender(String input) throws InputDataException {
        if (input.equals("f") || input.equals("m")) {
            return input.charAt(0);
        } else {
            throw new InputDataException("Неверный формат пола: " + input);
        }
    }
}