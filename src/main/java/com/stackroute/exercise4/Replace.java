package com.stackroute.exercise4;

public class Replace {
    public String replace(String string) {

        if (string != "") {


            // Replace all the 'd' characters with 'f' characters.

            String newString = string.replace('d', 'f');

            // Replace all the 'l' characters with 't' characters.

            String result = newString.replace('l', 't');


            return result;
        } else {
            return "should not enter empty string";
        }
    }
}
