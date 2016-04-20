public class Solution {
    /**
     * @param nums: an array of integers
     * @param s: an integer
     * @return: an integer representing the minimum size of subarray
     */
    public int minimumSize(int[] nums, int s) {
        // write your code here
        int sum = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i ++) {
            
            while(sum < s  && j < nums.length){
                sum += nums[j];
                j ++;
            }
            if(sum >= s) {
                min = Math.min(min, j - i);
            }
            sum -= nums[i];
        }
        if(min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}