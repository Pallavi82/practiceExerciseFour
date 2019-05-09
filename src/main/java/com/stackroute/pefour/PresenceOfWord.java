package com.stackroute.pefour;

/*Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? False*/

import java.util.Scanner;

public class PresenceOfWord {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Input the sentence");
            String s = scanner.nextLine();
            String[] str = s.split(" "); //splits the string with spaces

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Input the word to be searched");
            String s1 = scanner1.nextLine();
            String[] str1 = s1.split(" ");

            if(s.contains(s1)){ //if the word to be searched is there in the string it returns true, else false

                System.out.println("is " + s1 +" here? True");
            }

            else{

                System.out.println("is " + s1 + " here? False");
            }
        }
}
