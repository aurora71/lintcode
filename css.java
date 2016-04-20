public class Solution {
    /**
     * @param A an integer array
     * @return  A list of integers includes the index of the first number and the index of the last number
     */
    public ArrayList<Integer> continuousSubarraySum(int[] A) {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        int start = 0, end = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i ++) {
            if(sum < 0) {
                sum = A[i];
                start = end = i;
            } else {
                sum += A[i];
                end = i;
            } 
            if(max < sum) {
                max = sum;
                list.set(0,start);
                list.set(1,end);
            }
        }
        return list;
    }
}
        
