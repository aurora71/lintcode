public class Solution {
    /**
     * @param A, B: Two integer arrays.
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        // write your code here
        Arrays.sort(A);
        Arrays.sort(B);
        if(A[0] > B[B.length -1]) return A[0]-B[B.length -1];
        if(B[0] > A[A.length -1]) return B[0]-A[A.length -1]; 
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < A.length; i ++) {
            for(int j = 0; j < B.length; j ++) {
                min = Math.min(Math.abs((A[i] - B[j])),min);
            }
        }
        return min;
    }
}
