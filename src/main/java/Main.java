public class Main {

    public static void main(String[] args) {}

    public static String longestPalindrome(String s) {
        ValidateUserInput.validate(s);

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            String subString = s.substring(i);
            if (subString.length() < temp.length()) return temp;
            if (isPalindrome(subString)) {
                temp = StringHelper.getLargerString(temp, subString);
            } else {
                temp = StringHelper.getLargerString(temp, getBackwardPassLargestPalindrome(subString));
            }
        }
        return temp;
    }

    private static boolean isPalindrome(String s) {
        for(int i = 0; i <= s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static String getBackwardPassLargestPalindrome(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            String subString = s.substring(0, i);
            if (isPalindrome(subString)) {
                return subString;
            }
        }
        return "";
    }
}
