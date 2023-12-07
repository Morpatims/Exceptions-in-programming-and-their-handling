package com.example.userinfoapp;

import java.io.IOException;
import java.text.ParseException;

public class UserInfoApp {

    public static void main(String[] args) {
        try {
            System.out.println("Введите данные (в произвольном порядке):");
            String input = InputScannerHelper.readLine();

            UserInfoParser userInfoParser = new DefaultUserInfoParser();
            UserInfo userInfo = userInfoParser.parseUserInfo(input);

            UserInfoWriter userInfoWriter = new DefaultUserInfoWriter();
            userInfoWriter.writeToFile(userInfo);

            System.out.println("Данные успешно записаны в файл: " + userInfo.getFileName());

        } catch (InputDataException | ParseException | IOException e) {
            e.printStackTrace();
        }
    }
}