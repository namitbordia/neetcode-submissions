class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int c =0;
        int max =0;
        while(left<right){
            int min = Math.min(nums[left],nums[right]);
            c = min * (right-left);;
            max = Math.max(c,max);
            if(nums[left] < nums[right]){
                left++;
            }
            else{
                right--;
            }
            

        }
        return max;
    }
}
