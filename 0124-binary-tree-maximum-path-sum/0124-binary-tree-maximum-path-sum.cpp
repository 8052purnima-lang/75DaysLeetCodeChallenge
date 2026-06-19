class Solution {
    int sum = INT_MIN;
public:
    int maxPathSum(TreeNode* root) {
        dfs(root);
        return sum;
    }
    int dfs(TreeNode* root) {
        if (root == nullptr) return  0;
        int left = dfs(root->left);
        left = left < 0 ? 0 : left;
        int right = dfs(root->right);
        right = right < 0 ? 0 : right;
        sum = max(sum,root->val + left + right);
        return root->val + max(left,right);
    }
};