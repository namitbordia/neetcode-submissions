

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        int[] arr = new int[hs.size()];


        Iterator<Integer> it = hs.iterator();

        int k = 0;

        while(it.hasNext()){
            arr[k++] = it.next();
        }

        Arrays.sort(arr);

        int max = 0;
        int count = 1;

        for(int i = 0; i < k-1; i++){
            if(arr[i] + 1 == arr[i+1]){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
            }
        }

        max = Math.max(max, count);

        return max;
    }
}