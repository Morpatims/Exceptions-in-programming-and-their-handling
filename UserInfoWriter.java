package com.example.userinfoapp.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DefaultUserInfoWriter implements UserInfoWriter {

    @Override
    public void writeToFile(UserInfo userInfo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(userInfo.getFileName()))) {
            writer.write(userInfo.getFileContent());
        }
    }
}