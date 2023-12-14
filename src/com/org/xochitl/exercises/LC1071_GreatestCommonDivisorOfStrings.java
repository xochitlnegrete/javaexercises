/*
* For two strings s and t, we say "t divides s" if and only if s = t + ... + t
* (i.e., t is concatenated with itself one or more times).
* Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
Example 1:
Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
*
Example 2:
Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
*
Example 3:
Input: str1 = "LEET", str2 = "CODE"
Output: ""
* Constraints:
* 1 <= str1.length, str2.length <= 1000
* str1 and str2 consist of English uppercase letters.
*
*/

package com.org.xochitl.exercises;

public class LC1071_GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";

        System.out.println(greatestCommonDivisorOfStrings(s1, s2));
    }

    private static String greatestCommonDivisorOfStrings(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        StringBuilder resultAux = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            result.append(s1.charAt(i));

            if(s1.charAt(i) != resultAux.charAt(0)) {
                result.append(s1.charAt(i));
            }
            System.out.println(result);
        }

        return result.toString();
    }
}
