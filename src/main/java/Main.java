public class Main {
    public static void main(String[] args) {

    }

    public static String longestPalindrome(String s) {
        return s;
    }

    public static boolean isPalindrome(String s) {
        if (s == null || s.isBlank()) {
            return true;
        }
        for(int i = 0; i <= s.length() / 2; i++) {
           if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
               return false;
           }
        }
        return true;
    }
}
