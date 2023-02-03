class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currlevel=new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode curr=queue.remove();
                currlevel.add(curr.val);
               if(curr.left!=null){
                   queue.add(curr.left);
               }
                if(curr.right!=null){
                    queue.add(curr.right);
               }
            }
        res.add(currlevel);
        }
        return res;
    }
}
