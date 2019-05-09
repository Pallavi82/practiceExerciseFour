package com.stackroute.pefour;

/*Write a program to transpose the given string.
Input String : a quick brown fox jumps over the lazy dog
Output String: a kciuq nworb xof spmuj revo eht yzal god*/

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
                    reverseWord = reverseWord + word.charAt(j); // reverses the individual word
                }
                reversedString = reversedString + reverseWord + " "; //together forms the reversedwords into the string
            }
            System.out.println(reversedString); //displays reversed string
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

