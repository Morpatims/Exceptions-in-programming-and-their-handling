package com.example.userinfoapp.model;

public class UserInfo {

    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String birthDate;
    private final long phoneNumber;
    private final char gender;

    public UserInfo(String lastName, String firstName, String middleName, String birthDate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFileName() {
        return lastName + ".txt";
    }

    public String getFileContent() {
        return lastName + firstName + middleName + birthDate + " " + phoneNumber + gender;
    }
}