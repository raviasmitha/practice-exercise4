package com.stackroute.exercise4;

import java.util.regex.*;
public class RegularExpression {
    boolean result; // for the return value

    public String findpresence(String string , String word) {
        if (string != null) {
           if(string.toLowerCase().contains(word.toLowerCase())) // checks wheather the substring is present
           {
               result = true;
           } else {
                result = false;
           }

            return "Is Harry here ?" + result;

        }else return null;
    }
}


