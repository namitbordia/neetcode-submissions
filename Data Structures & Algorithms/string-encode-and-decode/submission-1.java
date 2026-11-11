class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb1 = new StringBuilder();
        for(String s : strs){
            sb1.append(s).append("|||");
           
        }
        String r = sb1.toString();
        return r;
    }

    public List<String> decode(String str) {
        String[] s = str.split("\\|\\|\\|", -1);
        List<String> l1 = new ArrayList<>();
        for(int i = 0 ;i<s.length-1;i++){
            l1.add(s[i]);
        }
        return l1;
    }
}
