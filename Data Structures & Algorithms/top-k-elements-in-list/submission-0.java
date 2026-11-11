class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> frecount = new HashMap<>();

        for (int num : nums) {
            frecount.put(num, frecount.getOrDefault(num, 0) + 1);
        }

        // store unique numbers
        Integer[] arr = frecount.keySet().toArray(new Integer[0]);

        // sort based on frequency (descending)
        Arrays.sort(arr, (a, b) -> frecount.get(b) - frecount.get(a));

        int[] freq = new int[k];
        for (int i = 0; i < k; i++) {
            freq[i] = arr[i];
        }

        return freq;
    }
}