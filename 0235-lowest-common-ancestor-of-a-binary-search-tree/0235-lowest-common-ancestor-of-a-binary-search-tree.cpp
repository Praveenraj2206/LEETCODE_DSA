/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        
        // Traverse the BST
        while(root != NULL)
        {
            // Both nodes are smaller
            if(p->val < root->val && q->val < root->val)
            {
                root = root->left;
            }
            
            // Both nodes are greater
            else if(p->val > root->val && q->val > root->val)
            {
                root = root->right;
            }
            
            // Split occurs here
            else
            {
                return root;
            }
        }
        
        return NULL;
    }
};