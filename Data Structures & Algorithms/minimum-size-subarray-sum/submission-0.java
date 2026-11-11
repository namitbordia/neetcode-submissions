class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = nums.length;
        int count = 0;
        int l =0;
        int allsum = 0;
        for(int i= 0;i<nums.length;i++){
            allsum +=nums[i];
        }
        if(allsum < target){
            return 0;
        }
        for(int i = 0;i<nums.length;i++){
            count+= nums[i];
            while(count >= target){
                min = Math.min(min , i-l);
                count -= nums[l];
                l++;
            }
        }
        return min+1;
    }
}