class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length*2;
        int[] ans = new int[n];
        for(int i =0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i=nums.length;i<n;i++){
            ans[i] = nums[i-nums.length];
        }
        return ans;
        
    }
}