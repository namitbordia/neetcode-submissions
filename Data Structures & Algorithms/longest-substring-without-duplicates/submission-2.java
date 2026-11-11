class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max =0;
        HashSet<Character> hs = new HashSet<>();
        int k =0;
        for(int i = 0 ;i<s.length(); i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(k));
                k++;
            }
                hs.add(s.charAt(i));
                if(i-k+1>max){
                    max= i-k+1;
                }
        }
        return max;
    }
}
