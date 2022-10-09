/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int maxDepth(TreeNode* node) {
         if(node == NULL) {
           return 0;
       }
       int leftheight = maxDepth(node->left);
       int rightheight = maxDepth(node->right);
       int ans = max(leftheight , rightheight);
       return ans + 1;
    }
};