class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        if not root: return None
    
        res = []
        def paths(root, path):
            if not any([root.left, root.right]):
                res.append(path)
                
            paths(root.left, path + '->' + str(root.left.val)) if root.left else None
            paths(root.right, path + '->' + str(root.right.val)) if root.right else None
        
        paths(root, str(root.val))
        return res
