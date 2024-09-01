class Solution {
    public List<String> commonChars(String[] words) {
        String baseS = words[0];
        int baseSlen = baseS.length();

        int len = words.length;
        
        List<String> ans=new ArrayList();

        HashMap<Character,Boolean> map=new HashMap();

        for (int i = 0; i < baseSlen; i++) {

            char c = baseS.charAt(i);
            if(map.containsKey(c)) continue;
            boolean overallFound=true;

            for (int j = 1; j < len; j++) {
                String temp = words[j];
                int tempLen = temp.length();
                boolean found=false;

                for (int k = 0; k < tempLen; k++) {
                    if(c==temp.charAt(k)) {
                        found=true;
                        words[j]=removeI(k,temp,tempLen);
                        break;
                    }
                }

                if(!found) {
                    map.put(c,false);
                    overallFound=false;
                    break;
                }
            }

            if(overallFound){
                ans.add(baseS.charAt(i)+"");
            }
        }
    

        return ans;

    }

    String removeI(int i, String s, int len) {
        return s.substring(0, i) + s.substring(i + 1, len);
    }
}