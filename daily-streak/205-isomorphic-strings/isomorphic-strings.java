class Solution {
    public boolean isIsomorphic(String s, String t) {
        int lenS=s.length();
        int lenT=t.length();
        if(lenS!=lenT) return false;
        
        int[] arr=new int[127];

        for(int i=0;i<=126;i++){
            arr[i]=-1;
        }

        int[] tArr=new int[127];

        for(int i=0;i<=126;i++){
            tArr[i]=-1;
        }

        boolean twice=false;
        for(int i=0;i<lenS;i++){
            twice=false;
            char charAtS=s.charAt(i);
            char charAtT=t.charAt(i);
            if(arr[charAtS]!=-1){
               twice=true;
               if(arr[charAtS]!=charAtT) return false; 
            }else{
                arr[charAtS]=charAtT;
            }

            if(tArr[charAtT]!=-1 && !twice){
                return false;
            }else{
                tArr[charAtT]=charAtS;
            }
        }

        return true; 
    }
}