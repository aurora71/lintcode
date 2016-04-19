public class Solution {
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if(A.length == 0 || A == null) {
            return 0;
        }
        
        int left = 1; 
        int right = 1; 
        int max = 1;
        int ml = 1;
        int mr = 1;
        for(int i = 1; i < A.length ; i++){
            if(A[i] > A[i - 1]) {
                left ++;
                ml = Math.max(ml, left);
            } else {
                left = 1;
            }
        }
        
        for(int j = A.length - 1; j > 0; j --){
            if(A[j - 1] > A[j]) {
                right ++;
                mr = Math.max(mr, right);

            }else {
                right = 1;
            }
        }
        max = Math.max(ml, mr);
        return max;
    }
}