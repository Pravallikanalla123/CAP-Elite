public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "N";
        }
        return String.valueOf(root.val)+" "+serialize(root.left)+" "+serialize(root.right);
    }

    // Decodes your encoded data to tree.
    int i=0;
    public TreeNode deserialize(String data) {
        String[] arr=data.split(" ");
        return pre(arr);
    }
    TreeNode pre(String[] arr){
        if(arr[i].equals("N")){
            i++;
            return null;
        }
        TreeNode node=new TreeNode(Integer.parseInt(arr[i++]));
        node.left=pre(arr);
        node.right=pre(arr);
        return node;
    }
}
