class Solution {
    vector<int> dp;

public:
    int climbStairs(int n) {
        dp.resize(n+1, -1);
        return find(n);
    }
    int find(int n){
        if(n==0) return 1;
        if(n<0)  return 0;
        if(dp[n] != -1)  return dp[n];
        return dp[n] = find(n-1) + find(n-2);
    }
};