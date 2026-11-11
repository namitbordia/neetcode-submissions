class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] p = new int[nums.length];
        p[0]=nums[0];
        int c=0;
        for(int i =1;i<nums.length;i++){
            p[i]=p[i-1] +nums[i];
        }
        for(int i =0;i<nums.length;i++){
            if(p[i]==k){
                c++;
            }
        }
        for(int i =0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(p[j]-p[i]==k){
                    c++;
                }
            }
        }
        return c;
    }
}