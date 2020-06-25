class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return 1;
        }
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid_point = left+(right-left)/2;
            if(nums[mid_point] == target){
                return mid_point;
            }else if(nums[mid_point] > target) {
                right = mid_point-1;
            } else {
                left = mid_point+1;
            }
        }
        return -1;
        
    }
}