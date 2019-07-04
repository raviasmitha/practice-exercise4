package com.stackroute.exercise4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class MultipleOccurence {

    //this function returns the indices where the given substring occurs
    public String[] stringOccurence(String inputString, String subString) {

        inputString = inputString.toLowerCase();

        subString = subString.toLowerCase();

        Pattern pattern = Pattern.compile(subString); // taking substring for matching

        Matcher matcher = pattern.matcher(inputString);  // matching with string

        int count = ( inputString.split(subString, -1).length ) - 1;

        String[] result = new String[count];

        int i = 0;
        while(matcher.find()) {

            result[i] = String.valueOf(matcher.start())+" - "+String.valueOf(matcher.end());
            i++;

        }

        return  result;
    }

}