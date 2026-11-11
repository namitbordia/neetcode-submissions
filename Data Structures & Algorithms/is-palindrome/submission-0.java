class Solution {
    public boolean isPalindrome(String s) {
        s=s.replace(" ","");
        s=s.toLowerCase();
        char[] arr = new char[s.length()];
        int arrow=0;
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                arr[arrow] = c;
                arrow++;

            }
        }
        for(int i=0;i<arrow/2;i++){
            if(arr[i]!=arr[arrow-1-i]){
                return false ;
            }

        }
        return true;
    }
}
