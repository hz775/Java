package com.bridgelabz.oops.leveltwo;

class PalindromeChecker {
    String text;

    void checkPalindrome() {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                System.out.println("Not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Given text is palindrome");
    }

}
