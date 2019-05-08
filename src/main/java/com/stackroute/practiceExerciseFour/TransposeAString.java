package com.stackroute.practiceExerciseFour;

import java.util.Scanner;

public class TransposeAString {

        public void reverseWordInMyString(String str)
        {
            String[] words = str.split(" ");
            String reversedString = "";
            for (int i = 0; i < words.length; i++)
            {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length()-1; j >= 0; j--)
                {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }
            System.out.println(reversedString);
        }
        public static void main(String[] args)
        {
            Scanner str=new Scanner(System.in);
            System.out.println("Enter the string:");
            String inputString=str.nextLine();
            TransposeAString transposeAString = new TransposeAString();
            transposeAString.reverseWordInMyString(inputString);
        }
    }

