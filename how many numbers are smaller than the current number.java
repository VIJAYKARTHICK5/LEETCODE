class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int newarr[]=new int[n];
        int count;
        for(int i=0;i<n;i++){
            int num=nums[i];
            count=0;
            for(int j=0;j<n;j++){
                if(nums[j]<num){
                    count++;
                    newarr[i]=count;
                }
            }
        }
        return newarr;
    }
}
