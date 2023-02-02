class Solution {
    public boolean isValidBST(TreeNode root) {
        return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean valid(TreeNode node,long start,long end){
        if(node==null){
             return true;
        }
        if(start<node.val && end>node.val){
            return valid(node.left,start,node.val)&&valid(node.right,node.val,end);
        }
        return false;
    }
}
