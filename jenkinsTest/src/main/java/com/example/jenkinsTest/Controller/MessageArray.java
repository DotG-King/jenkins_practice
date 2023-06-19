package com.example.jenkinsTest.Controller;

import java.util.ArrayList;

public class MessageArray {
    public static ArrayList<String> messageArray = new ArrayList<>();
    public void addArray(String string) {
        messageArray.add(string);
    }
    public ArrayList<String> printArray() {
        return messageArray;
    }
}
