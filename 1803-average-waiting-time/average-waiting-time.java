class Solution {
    public double averageWaitingTime(int[][] customers) {
        int totalCustomers=customers.length;
        long sumOfWaitingTime=0;
        long startTime=customers[0][0];

        for(int i=0;i<totalCustomers;i++){
            if(startTime < customers[i][0]){
                startTime=customers[i][0];
            }
            sumOfWaitingTime+= (startTime + customers[i][1]) - customers[i][0];
            startTime=startTime + customers[i][1];
        }

        return sumOfWaitingTime / (double) totalCustomers;
    }
}