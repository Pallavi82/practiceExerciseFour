package com.stackroute.pefour;

/*Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.
Input : She sells seashells by the seashore
Given word: se
Output :
Found at: 4 - 6
Found at: 10 - 12
Found at: 27 – 29*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class OccurencesOfAWord {

        public static void main(String args[]){

            String sea = "She sells seashells by the seashore";

            Pattern pattern = Pattern.compile("sea");
            Matcher matcher = pattern.matcher(sea);

            int count = 0;

            while (matcher.find()) {

                count++;

                System.out.print("Found at: ");
                System.out.print(matcher.start()+" - ");
                System.out.println(matcher.end());
            }

        }

}
