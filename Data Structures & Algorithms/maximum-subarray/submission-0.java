class Solution {
    int maximum(int a, int b){
        if (a<b){
           return b;
        }
        else {
            return a;
        }
    }
    public int maxSubArray(int[] nums) {
        int c=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
                c = maximum(nums[i],c+nums[i]);
                max= maximum(c,max);
        }
        return max;
    }
}