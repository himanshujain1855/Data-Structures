class Solution {
    public List<Integer> grayCode(int n) {
       int ansSize=(1 << (n));

        Integer[] ansArr=new Integer[ansSize];


        for(int i=0; i< ansSize;i++){
            ansArr[i]=(i ^ (i >> 1));
        }

        return Arrays.asList(ansArr);
    }
}