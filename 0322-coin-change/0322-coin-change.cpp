class Solution {
    vector<vector<int>> dp;
public:
    int coinChange(vector<int>& coins, int amount) {
        dp.resize(coins.size(),vector<int>(amount+1,-1));
        int ans = find(coins,amount,0);
        return ans == 1e9 ? -1 : ans;
    }
    int find(vector<int>& coins,int target,int i) {
        if (target < 0) return 1e9;
        if (target == 0) return 0;
        if (i == coins.size()) return 1e9;
        if (dp[i][target] != -1) return dp[i][target];
        int pick = 1 + find(coins,target-coins[i],i);
        int notPick = find(coins,target,i+1);
        return dp[i][target] = min(pick,notPick);
    }
};