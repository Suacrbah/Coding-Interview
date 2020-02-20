/*
Java solution to LeetCode 125: Valid Palindrome.

Level: Easy

Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false

Submission:

Success

Runtime: 3 ms, faster than 87.15% of Java online submissions for Valid Palindrome.

Memory Usage: 38.9 MB, less than 67.86% of Java online submissions for Valid Palindrome.
*/

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        boolean ans = isPalindrome(s);
        System.out.printf("answer: %b\n", ans);
    }

    public static boolean isPalindrome(String s) {
        int ind1 = 0;
        int ind2 = s.length() - 1;
        char char1, char2;
        boolean ans = true;
        s = s.toLowerCase();
        while (ind1 < ind2) {
            char1 = s.charAt(ind1);
            char2 = s.charAt(ind2);
            if (!Character.isLetter(char1) && !Character.isDigit(char1)) {
                ind1++; continue;
            }
            else if (!Character.isLetter(char2) && !Character.isDigit(char2)) {
                ind2--; continue;
            }
            else if (char1 == char2 ||
                     char1 + 32 == char2 ||
                     char1 - 32 == char2) {
                ind1++; ind2--;
            } 
            else {
                ans = false;
                break;
            } 
        }
        return ans;
    }
}
