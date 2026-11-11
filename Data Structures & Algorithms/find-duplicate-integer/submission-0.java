class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length-1;
        int ni=(n*(n+1))/2;
        int s=0;
        int k=0;
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return k;
    }
}