class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length/3;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
         List<Integer> result = new ArrayList<>();
        int mn3 = 0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int s = e.getValue();
            int k = e.getKey();
            if(s>n){
                result.add(k);
            }
        }
        return result;
    }
}