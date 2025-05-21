package com.bridgelabz.oops.leveltwo;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string=scanner.nextLine();
        PalindromeChecker palindromeChecker=new PalindromeChecker();
        palindromeChecker.text=string;
        palindromeChecker.checkPalindrome();
        scanner.close();
    }
}
