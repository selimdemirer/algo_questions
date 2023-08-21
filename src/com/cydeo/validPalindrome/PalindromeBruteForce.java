package com.cydeo.validPalindrome;

public class PalindromeBruteForce {

    public static void main(String[] args) {

        String p = "Was   it   a   car   or   a     cat İ saw?";

//        System.out.println(isPalindrome(p));
        System.out.println(isPalindromeWithTwoPointer(p));

    }

    public static boolean isPalindrome(String p) {

        String sentence = p.toLowerCase();
        String result = "";
        String reversed = "";

        isAllSpecialCharsRemoved(sentence, result);

        System.out.println("sentence = " + sentence);

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversed += sentence.charAt(i);
        }

        System.out.println("reversed = " + reversed);
//        if (!result.equals(reversed)) return false;

        return sentence.equals(reversed);
    }

    private static void isAllSpecialCharsRemoved(String sentence, String result) {
        for (int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') || ((sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9'))) result += sentence.charAt(i);
        }
    }

    public static boolean isPalindromeWithTwoPointer(String sentence) {

        sentence = sentence.replaceAll("[\\p{Punct}]", "").replaceAll(" ", "").toLowerCase();
        System.out.println("sentence = " + sentence);
        //radar
        int leftIndex = 0;
        int rightIndex = sentence.length() - 1;

        while (leftIndex < rightIndex) {
            if (sentence.charAt(leftIndex) == sentence.charAt(rightIndex)) {
                leftIndex++;
                rightIndex--;
            } else {
                return false;
            }
        }

        return true;
    }
}
/*
Question-2 Valid PalindromeBruteForce
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
https://leetcode.com/problems/valid-palindrome/
 */