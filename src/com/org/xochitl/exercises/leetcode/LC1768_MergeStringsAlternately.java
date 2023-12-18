/*
* You are given two strings word1 and word2.
* Merge the strings by adding letters in alternating order, starting with word1.
* If a string is longer than the other, append the additional letters onto the end of the merged string.
*
* Return the merged string.
*
* Constraints:
* 1 <= word1.length, word2.length <= 100
* word1 and word2 consist of lowercase English letters.
*
Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
*
Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
*
Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
* */

package com.org.xochitl.exercises.leetcode;

public class LC1768_MergeStringsAlternately {

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrs";
        String mergeStringsAlternately = mergeStringsAlternately2(word1, word2);

        System.out.println(mergeStringsAlternately);
    }

    private static String mergeStringsAlternately(String word1, String word2) {
        StringBuilder mergeStringsAlternately = new StringBuilder();
        int minLen = Math.min(word1.length(),word2.length());
        int maxLen = Math.max(word1.length(),word2.length());

        //append all word1 and word2 until min length
        for (int i = 0; i < minLen; i++) {
            mergeStringsAlternately.append(word1.charAt(i));
            mergeStringsAlternately.append(word2.charAt(i));
        }

        //enter if strings has different length
        for (int i = minLen; i < maxLen; i++) {
            if(maxLen == word1.length()) {
                mergeStringsAlternately.append(word1.charAt(i));
            }
            else {
                mergeStringsAlternately.append(word2.charAt(i));
            }
        }

        return  String.valueOf(mergeStringsAlternately);
    }
    private static String mergeStringsAlternately2(String word1, String word2) {
        StringBuilder mergeStringsAlternately = new StringBuilder();
        int i = 0;

        do {
            if(i < word1.length()) mergeStringsAlternately.append(word1.charAt(i));
            if(i < word2.length()) mergeStringsAlternately.append(word2.charAt(i));
            i++;
        } while (word1.length() > i || word2.length() > i);

        return  String.valueOf(mergeStringsAlternately);
    }
}
