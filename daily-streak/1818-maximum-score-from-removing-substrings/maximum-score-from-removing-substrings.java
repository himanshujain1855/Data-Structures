class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans=0;
        int len=s.length();
        if(len==1) return ans;
        String highScoreString= x > y ? "ab" : "ba";
        String lowScoreString= x < y ? "ab" : "ba";
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        Character lastPushed=s.charAt(0);

        for (int i = 1; i < len; i++) {
            if(highScoreString.equals(lastPushed+""+s.charAt(i))){
                stack.pop();
                lastPushed=!stack.isEmpty() ? stack.peek() : null;
                ans+=Math.max(x,y);
            }else{
                lastPushed=stack.push(s.charAt(i));
            }
        }

        int remainingSize=stack.size();
        if(remainingSize==0) return ans;
        s="";

        for(int i=0;i<remainingSize;i++){
            s+=stack.elementAt(i);
        }

        stack=new Stack<>();
        stack.push(s.charAt(0));
        lastPushed=s.charAt(0);
        len=s.length();
        for (int i = 1; i < len; i++) {
            if(lowScoreString.equals(lastPushed+""+s.charAt(i))){
                stack.pop();
                lastPushed=!stack.isEmpty() ? stack.peek() : null;
                ans+=Math.min(x,y);
            }else{
                lastPushed=stack.push(s.charAt(i));
            }
        }


        return ans;
    }
}