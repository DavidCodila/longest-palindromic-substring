import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

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
    public void testIsPalindromeEmptyString() {
        assertTrue(Main.isPalindrome(""));
    }


    @Test
    public void testIsPalindromeNull() {
        assertTrue(Main.isPalindrome(null));
    }
}
