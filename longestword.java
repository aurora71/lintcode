class Solution {
    /**
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        int max = 0;
        ArrayList<String> string = new ArrayList<String>();
        for(int i = 0; i < dictionary.length; i ++) {
            max = Math.max(max, dictionary[i].length());
        }
        for(String i: dictionary) {
            if(i.length() == max) {
                string.add(i);
            }
        }
        return string;
    }
};