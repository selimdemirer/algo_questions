package com.cydeo.validPalindrome;

public class Palindrome {

    public static void main(String[] args) {

        String p = "Was it a car or a cat İ saw?";

        System.out.println(isPalindrome(p));

    }

    private static boolean isPalindrome(String p){

        String sentence = p.toLowerCase();
        System.out.println(sentence);
        String result = "";
        String reversed = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i)>='a' && sentence.charAt(i)<='z') result+=sentence.charAt(i);
        }

        System.out.println(result);

        for (int i = result.length()-1; i >=0; i--) {
            reversed+=result.charAt(i);
        }

        System.out.println(reversed);

        if (!result.equals(reversed)) return false;

        return true;
    }
}
/*
Question-2 Valid Palindrome
Write a function that accepts a string and determines whether it is a palindrome, ignoring non-alphanumeric characters and case and returns true if it is palindrome.
(A string is said to be palindrome if it reads the same backward as forward, after converting all
uppercase letters into lowercase letters and removing all non-alphanumeric characters).
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
Constraints:
• 1 <= s.length <= 2 * 105
• s consists only of printable ASCII characters.
Please, test your solution here : https://leetcode.com/problems/valid-palindrome/
You may try two pointer technique for second question to improve your time & space complexity.
Two Pointer Strategy / Technique
• The name, “two pointers”, explains the strategy clearly.
• It's the use of two different pointers (usually to keep track of array, ArrayList or String
indices) to solve a problem with the benefit of saving time and space.
• A pointer is a reference to an object.
• In many problems involving collections such as arrays or lists, we should analyze each
element of the collection compared to its other elements.
• We can process two elements per loop instead of just one. Common patterns in the twopointer approach entail:
▪ Two pointers, each starting from the beginning and the end until they both meet.
▪ One pointer moving at a slow pace, while the other pointer moves at twice the speed.
 */