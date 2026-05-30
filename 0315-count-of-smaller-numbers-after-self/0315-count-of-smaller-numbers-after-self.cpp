class Solution {
public:
    vector<int> countSmaller(vector<int>& nums) {
        int n = nums.size();

        vector<int> ans(n);
        vector<int> sorted;

        for (int i = n - 1; i >= 0; i--) {

            int left = 0;
            int right = sorted.size() - 1;
            int pos = sorted.size();

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (sorted[mid] >= nums[i]) {
                    pos = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            ans[i] = pos;
            sorted.insert(sorted.begin() + pos, nums[i]);
        }

        return ans;
    }
};