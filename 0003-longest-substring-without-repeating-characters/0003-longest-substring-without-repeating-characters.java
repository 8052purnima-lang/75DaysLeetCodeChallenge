class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0; 
        int right=0;

        int maxLength=0;

        HashMap<Character , Integer>map = new HashMap<>();
        while(right<s.length()){
            char currentChar = s.charAt(right);

            if(map.containsKey(currentChar)) {
                int lastIndex= map.get(currentChar);
                int newLeft = lastIndex+1;
                if(newLeft >left) {
                    left = newLeft;

                }
            }
            map.put(currentChar,right);

            int currentWindowSize = right-left +1;

            if(currentWindowSize>maxLength) {
                maxLength = currentWindowSize;
            }
            right++;
        }
        return maxLength;
    }
}