class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        int ss= nums.length-1;
        while(i<=ss){
            if(nums[i]==val){
                int temp = nums[i];
                nums[i] = nums[ss];
                nums[ss]=temp;
                ss--;
            }
            else{
                i++;
            }
        }
        return ss+1;
    }
}