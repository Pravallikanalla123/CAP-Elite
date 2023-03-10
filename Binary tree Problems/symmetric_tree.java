class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return issymmetric(root.left,root.right);
        
    }
    private boolean issymmetric(TreeNode left,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if(left.val!=right.val){
            return false;
        }
        return issymmetric(left.left,right.right) && issymmetric(left.right,right.left);
        
    }
}
