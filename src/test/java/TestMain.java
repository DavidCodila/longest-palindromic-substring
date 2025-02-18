import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    @Test
    public void testIsPalindrome_aba() {
        assertTrue(Main.isPalindrome("aba"));
    }

    @Test
    public void testIsPalindrome_abb() {
        assertFalse(Main.isPalindrome("abb"));
    }

    @Test
    public void testIsPalindrome_a() {
        assertTrue(Main.isPalindrome("a"));
    }

    @Test
    public void testIsPalindrome_abcdcba() {
        assertTrue(Main.isPalindrome("abcdcba"));
    }

    @Test
    public void testIsPalindromeEmptyString() {
        assertTrue(Main.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeNull() {
        assertTrue(Main.isPalindrome(null));
    }

    @Test
    public void testLongestPalindrome_aba() {
        assertEquals(Main.longestPalindrome("aba"),"aba");
    }

    @Test
    public void testLongestPalindrome_aaba() {
        assertEquals(Main.longestPalindrome("aaba"),"aba");
    }
}
