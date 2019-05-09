package com.stackroute.pefour;

/*Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry*/

import java.util.Scanner;

public class ReplaceCharacter {


        public static void main(String[] args) {

            Scanner str=new Scanner(System.in);
            System.out.println("Enter the InputString:");

            String InputString=str.nextLine();
            String str1=InputString.replaceAll("d", "f"); // replaces d with f
            String outputString=str1.replaceAll("l", "t"); // replaces l with t

            System.out.println("Output String after replacing d with f and l with t:\n " + outputString);
        }
}
