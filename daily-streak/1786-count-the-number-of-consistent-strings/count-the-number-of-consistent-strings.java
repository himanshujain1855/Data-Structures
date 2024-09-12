class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;   
        int allowedLen=allowed.length();

        int arr[]=new int[26];

        for(int i=0;i<allowedLen;i++){
            arr[allowed.charAt(i)-97]=1;
        }

        int wordsLen=words.length;

        for(int i=0;i<wordsLen;i++){
            String word=words[i];
            int wordLen=word.length();
            int allContains=1;

            for(int j=0;j<wordLen;j++){
                if(arr[word.charAt(j)-97]!=1) {
                    allContains=0;
                    break;
                }
            }

            count+=allContains;
        }

        return count;
    }


}