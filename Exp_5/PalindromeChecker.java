package Exp_5;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "radar";
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        StringBuffer reversedStringBuffer = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStringBuffer.append(str.charAt(i));
        }
        String reversedString = reversedStringBuffer.toString();
        return str.equals(reversedString);
    }
}
