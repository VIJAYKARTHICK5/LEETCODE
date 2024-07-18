class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        double totalWaitingTime = 0.0;
        int currentTime = 0;         
        for (int i = 0; i < n; i++) {
            int[] customer = customers[i];
            int arrivalTime = customer[0];
            int cookingTime = customer[1];
            int finishTime = Math.max(arrivalTime, currentTime) + cookingTime;
            int waitingTime = finishTime - arrivalTime;
            totalWaitingTime += waitingTime;
            currentTime = finishTime;
        }
        return totalWaitingTime / n;
    }
}
