class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int n1 = word2.length();
        int min = Math.min(n,n1);
        StringBuilder sb= new StringBuilder();
        for(int i =0;i<min;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            n--;
            n1--;
        }
        int l =0;
        while(n!=0){
            sb.append(word1.charAt(min+l));
            n--;
            l++;
        }
        while(n1!=0){
            sb.append(word2.charAt(min+l));
            n1--;
            l++;
        }
        String str=sb.toString();
        return str;

    }
}