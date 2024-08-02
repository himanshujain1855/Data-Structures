class Solution {
    public char repeatedCharacter(String s) {
        int[] chars=new int[26];
        
        int len=s.length();

        for(int i=0;i<len;i++){
            
            char c=s.charAt(i);

            if(chars[c-97]==1){
                return c;
            }else{
                chars[c-97]=1;
            }
        }
        return 'n'; 
    }
}