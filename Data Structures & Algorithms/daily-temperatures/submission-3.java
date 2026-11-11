class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] arr = new int[t.length];
        for(int i = 0 ;i<t.length;i++){
            for(int j = i ;j<t.length;j++){
                if(t[i]<t[j]){
                    arr[i] = j-i;
                    break;

                }
            }

        }
        return arr;
    }
}
