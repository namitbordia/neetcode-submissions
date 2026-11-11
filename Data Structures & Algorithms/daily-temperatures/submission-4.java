class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] arr = new int[t.length];
        int j = 0;
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<t.length;i++){
                
            while(!s.isEmpty()&& t[s.peek()]<t[i]){
                j=s.pop();
                arr[j]=i-j;

            }
             s.push(i);
        }
        return arr;

    }
}
