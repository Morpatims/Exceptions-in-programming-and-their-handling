package com.example.userinfoapp.model;

public interface UserInfoWriter {
    void writeToFile(UserInfo userInfo) throws IOException;
}