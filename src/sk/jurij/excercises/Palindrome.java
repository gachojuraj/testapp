package sk.jurij.excercises;

public class Palindrome {
    public static boolean checkPalindrome(String str){
        return new StringBuffer(str).reverse().toString().equals(str);
    }
}