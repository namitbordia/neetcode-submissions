class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr= new int[nums.length];
        int l=1;
        int n= nums.length;
        for(int i=0;i<n;i++){
            arr[i]=1;
        }
        for(int i =0 ;i<n;i++){
            arr[i]*=l;
            l*=nums[i];
        }
        int r=1;
        for(int i=n-1;i>=0;i--){
            arr[i]*=r;
            r*=nums[i];
        }
        return arr;

    }
    
}  
