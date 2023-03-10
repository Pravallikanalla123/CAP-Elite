class Solution:


    def minDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0

        left_depth = self.minDepth(root.left)
        right_depth = self.minDepth(root.right)

        return 1 + (
            min(left_depth, right_depth) or
            max(left_depth, right_depth)
        )
