class Solution {
    public boolean isPalindrome(String s) {
        s=convertToAlphanumeric(s);
        return isPalinDrome(s);
    }

    public static String convertToAlphanumeric(String s){
       int len=s.length();
        StringBuilder newS=new StringBuilder();

        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                newS.append(c);
            }else if(Character.isAlphabetic(c)){
                newS.append(Character.toLowerCase(c));
            }
        } 

        return newS.toString();
    }

    public boolean isPalinDrome(String word){
        int len=word.length();

        for(int i=0; i<(len/2); i++){
            if(word.charAt(i)!=word.charAt(len-i-1)) return false;
        }
        return true;
    }
}