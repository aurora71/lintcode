public class Solution {
   /**
     * @param A: An integer array
     * @return: The number of element in the array that 
     *          are smaller that the given integer
     */
    public ArrayList<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(A.length == 0 || A == null) {
            int len = queries.length;
            for(int i = 0; i < len; i ++) {
                list.add(0);
            }
            return list;
        }
        Arrays.sort(A);
        for (int i = 0 ; i< queries.length; i ++){
            for(int j = 0; j < A.length; j ++) {
                if(A[j] >= queries[i]) {
                    list.add(j);
                    break;
                }
            }
        }
        return list;
    }
}
