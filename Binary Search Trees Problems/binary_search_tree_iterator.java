class BSTIterator {
    Queue<Integer> queue=new LinkedList<Integer>();
        void inorder(TreeNode node){
           if(node==null) return;
            inorder(node.left);
            queue.add(node.val);
            inorder(node.right);
        }

    public BSTIterator(TreeNode root) {
        inorder(root);
    }
    
    public int next() {
        if(!queue.isEmpty()){
            return queue.poll();
        }
        return 0;
    }
    
    public boolean hasNext() {
        if(!queue.isEmpty()){
            return true;
        }
        return false;
    }
}
