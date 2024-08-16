class Solution {
    static String[] map=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList();
        letterCombinations(digits,ans,0,digits.length(),"");
        return ans;
    }

    public void letterCombinations(String digits,List<String> ans,int i,int N,String comb) {
        if(i==N){
            if(comb!=""){
                ans.add(comb);
            }
            return;
        }
        
        String key=map[digits.charAt(i)-48];
        
        int keyLen=key.length();

        for(int j=0;j<keyLen;j++){
            letterCombinations(digits,ans,i+1,N,comb+key.charAt(j));
        }
    }
}