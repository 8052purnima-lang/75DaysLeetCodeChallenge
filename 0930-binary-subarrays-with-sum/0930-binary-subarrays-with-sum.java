class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return find(nums,goal) - find(nums, goal-1);
    }
    int find(int [] arr, int target){
        int count=0, sum=0;
        int left=0, right=0;
        while(right<arr.length){
            sum += arr[right];
            while(left <= right && sum > target){
                sum -= arr[left];
                left++;
            }
            count += (right - left +1);
            right++;

        }
        return count ;
    }
}