class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        int ni=(n*(n+1))/2;
        int s=0;
        int k=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
           
        }
        return k;
    }
}