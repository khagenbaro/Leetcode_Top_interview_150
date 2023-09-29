public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String s =s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        char[] letters = s.replaceAll("[^a-zA-Z]", "").toCharArray();
        for(int i =0;i<letters.length;i++){
            if(!String.valueOf(letters[i]).equalsIgnoreCase(
                    String.valueOf(letters[letters.length-1-i]))){
                return  false;
            }
        }
        return true;
    }
}
/*
Code

Testcase
Testcase
Result

125. Valid Palindrome
Solved
Easy
Topics
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/
