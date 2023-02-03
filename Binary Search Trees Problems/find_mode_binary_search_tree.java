class Solution {
     List<Integer> list=new ArrayList();
        int max=0,count=0,lastval=Integer.MAX_VALUE;
        void inorder(TreeNode node){
            if(node==null) return;
            inorder(node.left);
            if(node.val==lastval){
                count++;
            }
            else{
                count=1;
            }
            if(count>max){
                max=count;
                list.clear();
                list.add(node.val);
            }
            else if(count==max){
                list.add(node.val);
            }
            lastval=node.val;
            inorder(node.right);
        }
    public int[] findMode(TreeNode root) {
        inorder(root);
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
