class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength=0;
        Map<Integer, Boolean> exploreMap = new HashMap<>();
        for(int num: nums) {
            exploreMap.put(num, Boolean.FALSE);
        }
        for(int num: nums){
            int currentLength = 1;

            int nextNum= num+1;
            while(exploreMap.containsKey(nextNum) && exploreMap.get(nextNum)== false) {
                currentLength++;
                exploreMap.put(nextNum, Boolean.TRUE);

                nextNum++;

            }
            int prevNum = num-1;
            while(exploreMap.containsKey(prevNum) && !exploreMap.get(prevNum)){
                currentLength++;
                exploreMap.put(prevNum, Boolean.TRUE);
                prevNum--;

            }
            longestLength = Math.max(longestLength, currentLength);

        }
        return longestLength;
    }
}