class Solution {
    public int threeSumMulti(int[] arr, int target) {
       int n=arr.length;
       int ans=0;
       int mod = (int)1e9 + 7;
       Arrays.sort(arr);
       for(int i=0;i<n;i++){
        int left = i+1, right = n-1;
        while(left<right){
            int sum = arr[i] + arr[left] + arr[right];

            if(sum ==target){
                if(arr[left] == arr[right]) {
                    int len = right-left+1;
                    ans +=(len *(len-1)/2);
                    ans %= mod;
                    break;
                }
                int freqL =0; int leftVal = arr[left];
                int freqR =0; int rightVal = arr[right];
                while(arr[left] == leftVal){
                    left++ ; freqL++;

                }
                while(arr[right] == rightVal){
                    right--; freqR++;

                }
                ans += (freqL * freqR);
                ans %= mod;

            } else if(sum>target){
                right --;
            } else {
                left++;
            }
        }
       } 
       return ans;
    }
}