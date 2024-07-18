package two_pointer;

public class FirstPalindromicString {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if(isPalindromic(words[0])){
                return words[0];
            }
        }
            return "";
    }

    public boolean isPalindromic(String word) {
        boolean b=true;
        int start=0;
        int end= word.length()-1;
        while(start<end){
            if(word.charAt(start)!=word.charAt(end)){
                b=false;
            }
        }
        return b;
    }


}
