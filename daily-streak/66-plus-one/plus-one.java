class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length;

        int car= (digits[len-1] + 1) / 10;
        
        int sum= (digits[len-1] + 1) % 10;
        List<Integer> ans=new ArrayList();
        if(car==0){
            digits[len-1]=sum;
            return digits;
        }else{
            ans.add(sum);
        }

        

        for(int i=len-2;i>=0;i--){
            sum= digits[i] + car;
            car = sum / 10;
            ans.add(sum % 10);
        }

        if(car==1){
            ans.add(1);
        }

        int ansSize=ans.size();
        
        int[] ansArr=new int[ansSize];

        for(int i=ansSize-1;i>=0;i--){
            ansArr[ansSize-i-1]=ans.get(i);
        }

        return ansArr;
    }
}