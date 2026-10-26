class Solution {
    public int[] searchRange(int[] nums, int target) {
       int f = firstIndex(nums,target);
       int l = lastIndex(nums , target);
       return new int []{f,l};
    }
    int firstIndex(int nums[],int target){
        int l=0,r=nums.length-1;
        int f=-1;
        while(l<=r){
            int mid =l+(r-l)/2;
            if(nums[mid]==target){
                f=mid;
                r=mid-1;
            }
            else if (target>nums[mid]) l = mid+1;
            else r = mid-1;
        }
        return f;
    } 
    int lastIndex(int nums[],int target){
        int l=0,r=nums.length-1;
        int f=-1;
        while(l<=r){
            int mid =l+(r-l)/2;
            if(nums[mid]==target){
                f=mid;
                l=mid+1;
            }
            else if (target>nums[mid]) l= mid+1;
            else r = mid-1;
        }
        return f;
    } 
  }