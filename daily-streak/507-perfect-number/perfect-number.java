class Solution {
    public boolean checkPerfectNumber(int num) {
        return num+num==(sumOfDivisors(num));
    }

    public static int sumOfDivisors(int num){
        int sum=0;

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(i!=num/i){
                    sum+=num/i;
                }
            }
        }

        return sum;
    }
}