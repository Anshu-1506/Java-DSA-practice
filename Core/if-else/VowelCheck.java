// Write a Program to Check Whether a Character is Vowel or Consonant.

import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a character :- ");
    char abc = sc.next().charAt(0);
    {
        if(abc=='a'||abc=='e'||abc=='i'||abc=='o'||abc=='u')
       System.out.println("Character is a vowel");
       else
       System.out.println("Character is a consonant");
    }
    }

}
