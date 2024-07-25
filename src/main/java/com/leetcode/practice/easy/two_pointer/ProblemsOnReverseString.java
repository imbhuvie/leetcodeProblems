package com.leetcode.practice.easy.two_pointer;

public class ProblemsOnReverseString {
/*    2000. Reverse Prefix of Word

    Given a 0-indexed string word and a character ch,reverse the segment of word that starts at
    index 0 and ends at the index of the first occurrence of ch (inclusive).
    If the character ch does not exist in word, do nothing.

    For example, if word = "abcdefd" and ch = "d", then you should reverse the segment
    that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".

    Constraints:

    1 <= word.length <= 250
    word consists of lowercase English letters.
    ch is a lowercase English letter.
*/
public String reversePrefix(String word, char ch) {
    String str="";
    for(int i=0;i<word.length();i++){
        if(word.charAt(i)==ch)
        {
            return word.charAt(i)+str+word.substring(i+1,word.length());
//      2nd approach without using else
//           String revString= reverseString(word.substring(0,i+1));
//           return revString+word.substring(i+1,word.length());
        }
        else
            str=word.charAt(i)+str;
    }

    return word;
}

    private String reverseString(String substring) {
        String str = "";
        for (int i = substring.length() - 1; i >= 0; i--) {
            str = str + substring.charAt(i);
        }
        return str;
    }
}
