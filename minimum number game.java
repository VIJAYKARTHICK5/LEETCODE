class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2){
            int a=nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=a;
        }
       return nums; 
    }
}
