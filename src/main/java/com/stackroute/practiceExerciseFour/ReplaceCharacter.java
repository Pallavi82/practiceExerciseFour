package com.stackroute.practiceExerciseFour;

import java.util.Scanner;

public class ReplaceCharacter {


        public static void main(String[] args) {

            Scanner str=new Scanner(System.in);
            System.out.println("Enter the InputString:");

            String InputString=str.nextLine();
            String str1=InputString.replaceAll("d", "f");
            String outputString=str1.replaceAll("l", "t");

            System.out.println("Output String after replacing d with f and l with t:\n " + outputString);
        }
    }
