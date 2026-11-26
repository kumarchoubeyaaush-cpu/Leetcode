class Solution {
    public int findShortestSubArray(int[] nums) {

        int maxVal = 0;

        // Find max value (to size arrays)
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
        }

        int[] count = new int[maxVal + 1];
        int[] first = new int[maxVal + 1];
        int[] last = new int[maxVal + 1];

        // Initialize first[] with -1
        for (int i = 0; i <= maxVal; i++) {
            first[i] = -1;
        }

        int degree = 0;
        int minLength = nums.length;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            count[num]++;

            if (first[num] == -1) {
                first[num] = i;
            }

            last[num] = i;

            // Update degree and min length
            if (count[num] > degree) {
                degree = count[num];
                minLength = last[num] - first[num] + 1;
            } 
            else if (count[num] == degree) {
                int length = last[num] - first[num] + 1;
                if (length < minLength) {
                    minLength = length;
                }
            }
        }

        return minLength;
    }
}