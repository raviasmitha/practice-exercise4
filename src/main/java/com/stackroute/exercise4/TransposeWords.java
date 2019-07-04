package com.stackroute.exercise4;
import java.util.*;

public class TransposeWords {
    String reverseStr;

    //reversing string

    // cheching string is empty

    public String reverseString(String string) {
        if (string == "") {
            return "Empty strings not allowed";
        }

        reverseStr = "";
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            reverseStr += reverseWord(words[i] + " ");
        }
        return reverseStr.trim();
    }

    // if string contains only one word

    public String reverseWord(String word) {
        String revWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }
        return revWord;
    }

}