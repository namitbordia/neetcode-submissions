class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        HashMap<Character , Integer > map = new HashMap<>();
        if(n>s2.length()) return false;
        for(int i =0;i<n;i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
         HashMap<Character , Integer> tempmap = new HashMap<>();
        for(int i=0;i<n;i++){
            tempmap.put(s2.charAt(i),tempmap.getOrDefault(s2.charAt(i),0)+1);
            
        }
        for(int i=n;i<s2.length();i++){

            if(map.equals(tempmap)) return true;
            char l = s2.charAt(i-n);
            tempmap.put(l,tempmap.get(l)-1);
            if(tempmap.get(l) == 0){
                tempmap.remove(l);
            }
            tempmap.put(s2.charAt(i),tempmap.getOrDefault(s2.charAt(i),0)+1);
        }
        return map.equals(tempmap) ;



    }
}