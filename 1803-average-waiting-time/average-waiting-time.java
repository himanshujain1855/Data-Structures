class Solution {
    public double averageWaitingTime(int[][] customers) {
        long sumOfWaitingTime=0;
        long startTime=customers[0][0];

        for (int[] customer : customers) {
            if (startTime < customer[0]) {
                startTime = customer[0];
            }
            sumOfWaitingTime += (startTime + customer[1]) - customer[0];
            startTime = startTime + customer[1];
        }

        return sumOfWaitingTime / (double) (customers.length);
    }
}