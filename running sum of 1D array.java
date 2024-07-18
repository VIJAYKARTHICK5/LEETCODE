class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int res=nums[0];
        int arr[]=new int[n];
        arr[0]=nums[0];
        for(int i=1;i<n;i++){
            arr[i]=nums[i]+res;
            res=arr[i];
        }
        return arr;
        
    }
}
