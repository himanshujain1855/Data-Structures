class Solution {
    public boolean isIsomorphic(String s, String t) {
        int lenS=s.length();
        int lenT=t.length();
        if(lenS!=lenT) return false;
        

        HashMap<Character,Character> map=new HashMap();
        HashMap<Character,Character> tMap=new HashMap();
        boolean twice=false;
        for(int i=0;i<lenS;i++){
            twice=false;
            char charAtS=s.charAt(i);
            char charAtT=t.charAt(i);
            if(map.containsKey(charAtS)){
                twice=true;
               if(map.get(charAtS)!=charAtT) return false; 
            }else{
                map.put(charAtS,charAtT);
            }

            if(tMap.containsKey(charAtT) && !twice){
                return false;
            }else{
                tMap.put(charAtT,charAtS);
            }
        }

        return true; 
    }
}