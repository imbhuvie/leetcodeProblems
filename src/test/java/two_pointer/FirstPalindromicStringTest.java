package two_pointer;

import junit.framework.TestCase;

public class FirstPalindromicStringTest extends TestCase {
FirstPalindromicString firstPalindromicString=new FirstPalindromicString();
    public void testFirstPalindrome() {
        String[] s = { "def", "ghi","aba" };
        assertEquals("aba",firstPalindromicString.firstPalindrome(s));
    }
}