public class Solution {
    public void nextPermutation(int[] nums) {
        int localMin = -1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                localMin = i-1;
                break;
            }
        }
        if(localMin==-1){
            swapSort(nums, 0, nums.length);
            return;
        }
        int nextHigherNumber = -1, nextHigherNumberIndex = -1;
        for(int j = localMin+1;j<nums.length;j++){
            if(nums[j]>nums[localMin]){
                nextHigherNumber = nums[j];
                nextHigherNumberIndex = j;
            }
            else    break;
        }
        nums[nextHigherNumberIndex] = nums[localMin];
        nums[localMin] = nextHigherNumber;
        swapSort(nums, localMin+1, nums.length);
    }
    public void swapSort(int[] nums, int lo, int hi){
        int i = lo;
        int j=hi-1;
        while(i<j){
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
            i++;
            j--;
        }
    }
}