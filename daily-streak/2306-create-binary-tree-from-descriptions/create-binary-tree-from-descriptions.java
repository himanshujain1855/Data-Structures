/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
     public static TreeNode createBinaryTree(int[][] descriptions) {
        int len = descriptions.length;

        HashMap<Integer, TreeNode> nodeAddressMap = new HashMap();
        Set<Integer> childs = new HashSet<>();

        for (int i = 0; i < len; i++) {
            int parent = descriptions[i][0];
            int child = descriptions[i][1];
            int left = descriptions[i][2];
            TreeNode nodeP;
            if (nodeAddressMap.containsKey(parent)) {
                nodeP = nodeAddressMap.get(parent);
            } else {
                nodeP = new TreeNode(parent);
                nodeAddressMap.put(parent, nodeP);
            }

            TreeNode nodeC;
            if (nodeAddressMap.containsKey(child)) {
                nodeC = nodeAddressMap.get(child);
            } else {
                nodeC = new TreeNode(child);
                nodeAddressMap.put(child, nodeC);
            }
            if (left == 1) {
                nodeP.left = nodeC;
            } else {
                nodeP.right = nodeC;
            }
            childs.add(child);
        }

        for (int[] arr : descriptions) {
            if (!childs.contains(arr[0])) return nodeAddressMap.get(arr[0]);
        }

        return null;
    }
}