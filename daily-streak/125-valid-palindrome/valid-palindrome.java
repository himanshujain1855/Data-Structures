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
            if(Character.isDigit(c) || Character.isAlphabetic(c)){
                newS.append(Character.toLowerCase(c));
            }
        }

        return newS.toString();
    }

    public boolean isPalinDrome(String word){
        int start=0;
        int end=word.length()-1;

        while(start <end){
            if(word.charAt(start)!=word.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}