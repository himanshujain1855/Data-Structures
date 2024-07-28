class Solution {
    public int[] singleNumber(int[] nums) {
        int numsXor=0;

        for(int num:nums){
            numsXor ^= num;
        }

        int lastSetBit =  (numsXor & (~(numsXor-1)));

        int n1=0;
        
        int n2=0;
        
        for(int num:nums){
            if((lastSetBit & num) !=0){
                n1^=num;
            }else{
                n2^=num;
            }
        }

        return new int[]{n1,n2};
    }
}