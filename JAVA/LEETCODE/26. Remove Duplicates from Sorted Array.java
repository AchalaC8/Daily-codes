class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int l=0;
        for(int r=1;r<n;r++){
            if(nums[l]!=nums[r]){
                l++;
                nums[l]=nums[r];
            }
        }
        return l+1;
    }
}
