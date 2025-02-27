class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = 0;
        int emptyBottles = 0;
        
        while (numBottles > 0) {
            total += numBottles;
            int newBottles = (numBottles + emptyBottles) / numExchange;
            emptyBottles = (numBottles + emptyBottles) % numExchange;
            numBottles = newBottles;
        }        
        return total;
    }
}
