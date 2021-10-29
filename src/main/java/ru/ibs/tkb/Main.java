package ru.ibs.tkb;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        String command = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            command = bufferedReader.readLine();
            System.out.println(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
