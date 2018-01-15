// Create a function that determines if a string is a palindrome
// A palindrome is a word which reads the same backward as forward


public class PalindromeChecker {

    public static void main(String[] args) {
        String word1 = "ana";
        String word2 = "racecar";
        String word3 = "noon";
        String word4 = "level";
        String word5 = "hello";
        String word6 = "palindrome";

        System.out.println("is the word " + word1 + " a palindrome?  " + palindromeChecker(word1));
        System.out.println("is the word " + word2 + " a palindrome?  " + palindromeChecker(word2));
        System.out.println("is the word " + word3 + " a palindrome?  " + palindromeChecker(word3));
        System.out.println("is the word " + word4 + " a palindrome?  " + palindromeChecker(word4));
        System.out.println("is the word " + word5 + " a palindrome?  " + palindromeChecker(word5));
        System.out.println("is the word " + word6 + " a palindrome?  " + palindromeChecker(word6));
    }

    public static boolean palindromeChecker(String inputWord) {
        int length = inputWord.length();
        for( int i = 0; i < length / 2; i++ )
            if (inputWord.charAt(i) != inputWord.charAt(inputWord.length() - i - 1)) {
            return false;
            }
        return true;
    }

}
