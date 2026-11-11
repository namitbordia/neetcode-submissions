class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int min =nums[0];
        int max=nums[nums.length-1];
        int miss=max+1;
        HashMap<Integer,Integer> map = new HashMap<>();
        if(max<1){
            return 1;
        }
        if(min<1){
            for(int i =0;i<nums.length;i++){
                if(nums[i]>=1){
                    min =nums[i];
                    break;
                }
            }
        }
        if(min !=1){
            return 1;
        }
        for(int i =min;i<max;i++){
            map.put(i,0);
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==0){
                if(e.getKey()<miss){
                    miss=e.getKey();
                }
            }
        }
        return miss;
    }
}