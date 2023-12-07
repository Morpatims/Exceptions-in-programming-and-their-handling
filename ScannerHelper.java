package com.example.userinfoapp.input;

import java.util.Scanner;

public class InputScannerHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine() {
        return scanner.nextLine();
    }

    public static void closeScanner() {
        scanner.close();
    }
}