class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int m=hours.length;
        int sum=0;
        for(int i=0;i<m;i++){
            if(hours[i]>=target){
                sum++;
            }
           }
        return sum;
    }
}
