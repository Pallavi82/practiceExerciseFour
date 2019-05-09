package com.stackroute.pefour;

/*Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.*/

import java.util.Scanner;

public class ExtractWords {

        String s;
        String st[];

        int count=0;

        ExtractWords(String str)
        {
            s=str;
        }

        void splitsort()
        {
            int i;
            st=s.split(" ");
            for(i=0;i<(st.length)-1; i++)
            {
                for(int j=0;j<(st.length)-1;j++)
                {
                    if(st[j].compareTo(st[j+1])>0)
                    {
                        String temp=st[j];
                        st[j]=st[j+1];
                        st[j+1]=temp;
                    }
                }
            }
        }
        void display()
        {
            System.out.println("Sorted Array");

            for(int i=0;i<(st.length);i++)
            {
                System.out.println(st[i]);
            }
        }

        public static void main(String str[])
        {
            Scanner scanner=new Scanner(System.in);
            String a;
            System.out.println("Enter the String: ");
            a=scanner.nextLine();

            ExtractWords extractWords = new ExtractWords(a);
            extractWords.splitsort();
            extractWords.display();
        }
}