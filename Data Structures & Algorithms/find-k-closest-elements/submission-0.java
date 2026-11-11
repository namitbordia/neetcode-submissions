class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int sum =0;
        int start = 0;
        List<Integer> l = new LinkedList<>();
        for(int i =0;i<k;i++){
            sum+=Math.abs(arr[i]-x);

        }
        int minsum = sum;
        for(int i=k;i<arr.length;i++){
            sum = sum -Math.abs(arr[i-k]-x) + Math.abs(arr[i] -x);
            if(minsum > sum){
                minsum = sum;
                start = i-k+1;
            }
        }
        for(int i=start;i<start+k;i++){
            l.add(arr[i]);
        }
        return l;
    }
}