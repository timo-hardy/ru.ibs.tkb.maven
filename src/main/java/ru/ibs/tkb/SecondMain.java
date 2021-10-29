package ru.ibs.tkb;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondMain {
    public static void main(String[] args) {

        String command = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            command = bufferedReader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(StringUtils.lowerCase(command));
    }
}
