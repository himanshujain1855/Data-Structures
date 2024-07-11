class Solution {
    public String reverseParentheses(String s) {
        int len=s.length();
        if(len==1) return s;
        if(len==3) return s.charAt(1)+"";
        int bracketIndex=0;
        int indexOpeningBracket=0;
        while (true) {
            bracketIndex=0;
            indexOpeningBracket=0;
            while (true) {
                if(bracketIndex>=len) return s;
                char c=s.charAt(bracketIndex);
                if('('==c){
                    indexOpeningBracket=bracketIndex;
                }else if(')'==c){
                    String rev=reverse(s.substring(indexOpeningBracket+1,bracketIndex));
                    s=s.substring(0,indexOpeningBracket)+rev+s.substring(bracketIndex+1,len);
                    len=s.length();
                    break;
                }
                bracketIndex++;
            }
        }
    }

    public static String reverse(String s){
        int len=s.length();
        char[] chars=s.toCharArray();
        for (int i = 0; i < len/2; i++) {
            char temp=chars[i];
            chars[i]=chars[len-i-1];
            chars[len-i-1]=temp;
        }
        return new String(chars);
    }
}