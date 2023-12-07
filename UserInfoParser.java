package com.example.userinfoapp.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DefaultUserInfoParser implements UserInfoParser {

    private static final String DATE_FORMAT = "dd.MM.yyyy";

    @Override
    public UserInfo parseUserInfo(String input) throws InputDataException, ParseException {
        String[] data = input.split("\\s+");

        if (data.length != 6) {
            throw new InputDataException("Неверное количество данных. Ожидается 6 параметров.");
        }

        String lastName = DataExtractor.extractString(data[0]);
        String firstName = DataExtractor.extractString(data[1]);
        String middleName = DataExtractor.extractString(data[2]);
        String birthDate = DataExtractor.extractDate(data[3], DATE_FORMAT);
        long phoneNumber = DataExtractor.extractPhoneNumber(data[4]);
        char gender = DataExtractor.extractGender(data[5]);

        return new UserInfo(lastName, firstName, middleName, birthDate, phoneNumber, gender);
    }
}
