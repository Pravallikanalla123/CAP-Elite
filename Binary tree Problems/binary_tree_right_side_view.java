class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                TreeNode curr=queue.remove();
                if(size==0){
                    res.add(curr.val);
                }
               if(curr.left!=null){
                   queue.add(curr.left);
               }
                if(curr.right!=null){
                    queue.add(curr.right);
               }
            }

        }
        return res;
        
    }
}
