package com.stackroute.exercise4;

public class Occurence {

    //this method will check the occurence of "a" in input string

    public String countOccurence(String string, String charecter) {
        String occurence = "";

        //check if string is empty

        if (string != "") {
            int charcount = string.length() - string.replaceAll(charecter, "").length();
            occurence = Integer.toString(charcount);
            return occurence;
        } else {
            return "should not enter empty string";
        }

    }
}
