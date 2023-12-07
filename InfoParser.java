package com.example.userinfoapp.model;

import java.text.ParseException;

public interface UserInfoParser {
    UserInfo parseUserInfo(String input) throws InputDataException, ParseException;
}