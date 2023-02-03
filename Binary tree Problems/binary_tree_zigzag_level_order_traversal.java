class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null){
            return res;
        }
        boolean reverse=false;
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> currlevel=new ArrayList();
            while(size-->0){
                TreeNode curr=queue.remove();
                currlevel.add(curr.val);
               if(curr.left!=null){
                   queue.add(curr.left);
               }
                if(curr.right!=null){
                    queue.add(curr.right);
               }
            }
            if(reverse){
                Collections.reverse(currlevel);
            }
            reverse=!reverse;
        res.add(currlevel);
        }
        return res;
        
    }
}
