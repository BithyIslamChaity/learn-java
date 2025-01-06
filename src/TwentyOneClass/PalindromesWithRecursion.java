package TwentyOneClass;

public class PalindromesWithRecursion {
    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }
    private static boolean isPalindrome(String s, int low, int high) {
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            return isPalindrome(s, low + 1, high - 1);
    }
    public static void main(String[] args) {
        System.out.println("Is Chaity a palindrome? "+ isPalindrome("Chaity"));
                System.out.println("Is Bithy a palindrome? "
                        + isPalindrome("Bithy"));
        System.out.println("Is Sayma a palindrome? "+ isPalindrome("Sayma"));
        System.out.println("Is Shamaratun a palindrome? "+ isPalindrome("Shamaratun"));
        System.out.println("Is Level a palindrome? "+ isPalindrome("Level"));

    }
}
