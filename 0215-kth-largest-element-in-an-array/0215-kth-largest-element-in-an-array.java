import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        for (int i = max; i >= min; i--) {
            int freq = count.getOrDefault(i, 0);
            k -= freq;
            if (k <= 0) {
                return i;
            }
        }
        return min; 
    }
}   