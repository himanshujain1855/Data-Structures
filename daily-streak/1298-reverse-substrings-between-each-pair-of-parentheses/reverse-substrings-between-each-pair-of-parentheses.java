class Solution {
    public String reverseParentheses(String s) {
        int len=s.length();
        Stack<Integer> stack=new Stack<>();
        String rev="";
        for (int i = 0; i < len; i++) {
            char c=s.charAt(i);
          if('('==c){
              stack.push(rev.length());
          }else if(')'==c){
              rev=reverse(rev,stack.pop(),rev.length());
          }else{
              rev+=c;
          }
        }

        return rev;
    }

    public static String reverse(String s,int begin,int end){
        char[] chars=s.toCharArray();
        for (int i = begin; i <((begin+end)/2); i++) {
            char temp=chars[i];
            chars[i]=chars[begin+end-i-1];
            chars[begin+end-i-1]=temp;
        }
        return new String(chars);
    }
}