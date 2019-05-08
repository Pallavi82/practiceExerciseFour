package com.stackroute.practiceExerciseFour;

import java.util.Scanner;

public class PresenceOfWord {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Input the sentence");

            String s = scanner.nextLine();
            String[] str = s.split(" ");

            Scanner scanner1 = new Scanner(System.in);

            System.out.println("Input the word to be searched");
            String s1 = scanner1.nextLine();
            String[] str1 = s1.split(" ");

            if(s.contains(s1)){

                System.out.println("is " + s1 +" here? True");
            }

            else{

                System.out.println("is " + s1 + " here? False");
            }
        }
    }
