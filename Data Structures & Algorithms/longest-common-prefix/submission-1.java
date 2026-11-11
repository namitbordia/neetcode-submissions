class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k = 0 ;
        for(int i = 0 ;i<=strs[0].length();i++){
           String km = strs[0].substring(0,i);
           for(int j = 1;j<strs.length;j++){
            if(!strs[j].startsWith(km)){
                return strs[0].substring(0, i-1);
            }
           } 
        }
        return strs[0];
    }
}