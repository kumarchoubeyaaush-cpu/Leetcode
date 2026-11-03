class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums,0,nums.length -1);
        return nums;
    }
        // Divide
        public static void divide(int[] nums, int low, int high){
            if(low >= high){
                return;
            }

            int mid = low +(high - low)/2;
            divide(nums, low, mid);
            divide(nums, mid +1, high);
            conquer(nums, low, high, mid);
        }

        // Conquer
        public static void conquer(int[] nums, int low, int high, int mid){
            int[] merged = new int[high - low +1];  //it is like int[4] means array size is 4.

            int sort1 = low;
            int sort2 = mid +1;
            int k =0;

            while(sort1 <= mid && sort2 <= high){
                if(nums[sort1] <= nums[sort2]){
                    merged[k] =nums[sort1];
                    k++; sort1++;
                }else{
                    merged[k] = nums[sort2];
                    k++; sort2++;
                }
            }

            while(sort1 <= mid){
                merged[k] =nums[sort1];
                k++; sort1++;
            }

            while(sort2 <= high){
                merged[k] = nums[sort2];
                k++; sort2++;
            }

              for(int i =0, j = low; i < merged.length; i++, j++){
            nums[j] = merged[i];
            
        }

        }
      

        
    
}