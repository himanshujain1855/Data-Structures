class Solution {
    public int generateKey(int num1, int num2, int num3) {        
        int counter=0;
        StringBuilder strBuilder = new StringBuilder();
        while(counter < 4){
            int d1=num1%10;
            num1/=10;

            int d2=num2%10;
            num2/=10;

            int d3=num3%10;
            num3/=10;

            int d=Math.min(Math.min(d1,d2),d3);
            
            strBuilder.append(d+"");
            counter++;
        }
         return Integer.parseInt(strBuilder.reverse().toString());
    }
}