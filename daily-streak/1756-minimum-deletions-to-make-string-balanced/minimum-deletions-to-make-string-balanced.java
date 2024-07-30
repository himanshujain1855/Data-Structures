class Solution {
    public int minimumDeletions(String s) {
        int len=s.length();

        Stack<Character> pairs=new Stack();
        int count=0;
        for(int i=0;i<len;i++){
            if('a'==s.charAt(i)){
                if(!pairs.isEmpty() && pairs.peek()=='b'){
                    pairs.pop();
                    count++;
                }else{
                    pairs.push('a');
                }
            }else{
               pairs.push('b'); 
            }
        }

        return count;
    }
}