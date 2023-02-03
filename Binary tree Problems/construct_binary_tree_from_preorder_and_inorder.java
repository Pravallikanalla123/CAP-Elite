class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return binarytree(preorder,inorder,0,inorder.length-1,0);
        
    }
    private TreeNode binarytree(int[] preorder,int[] inorder,int start,int end,int index){
        if(start>end) return null;
        TreeNode root=new TreeNode(preorder[index]);
        int inindex=start;
        while(preorder[index]!=inorder[inindex]) inindex++;
        root.left=binarytree(preorder,inorder,start,inindex-1,index+1);
        root.right=binarytree(preorder,inorder,inindex+1,end,index+inindex-start+1);
        return root;
    }
}
