package com.cydeo.validAnagram;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));

    }

    private static boolean isAnagram(String s, String t){

        if (s.length()<1 || s.length()>10000) return false;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        if (!Arrays.equals(sCharArray,tCharArray)) return false;

        return true;
    }
}
/*
Question-1 Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Constraints:
 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Please, test your solution here : https://leetcode.com/problems/valid-anagram/
 */