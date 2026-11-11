class Solution {
    public int search(int[] nums, int target) {
        int low=0 ;
        int high = nums.length-1;
        int mid = low + (high - low) / 2;
        int i=1;
        while(high >=low ){
            if(nums[mid]==target){
                return mid;
            }
            if(nums[high] == target){
                return high;
            }
            if(nums[low] == target){
                return low;
            }
            else{
                if(i<nums.length  && mid+i > nums.length-1){
                    if(nums[mid-i]==target)
                    {
                        return mid -i;
                    }

                }
            }
            i++;
            low++;
            mid++;
            high--;
        }
        return -1;
    }
}