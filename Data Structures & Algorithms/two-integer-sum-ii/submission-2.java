class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        int sss=0;
        int n= numbers.length;
        for(int i=0;i<n;i++){
            int s= target- numbers[i];
            for(int j =i+1;j<n;j++){
                if(numbers[j]==s){
                    arr[sss++]=i+1;
                    arr[sss]=j+1;
                    return arr;
                }
            }
        }
        return arr;
    }
}
