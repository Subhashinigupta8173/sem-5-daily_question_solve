// Last updated: 28/8/2025, 12:03:11 pm
import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<VerticalPair> q = new LinkedList<>();
        TreeMap<Integer, List<VerticalPair>> map = new TreeMap<>();

        // start BFS
        q.add(new VerticalPair(root, 0, 0));

        while (!q.isEmpty()) {
            VerticalPair vp = q.poll();

            // add node to map
            if (!map.containsKey(vp.vt)) {
                map.put(vp.vt, new ArrayList<>());
            }
            map.get(vp.vt).add(vp);

            // add children with updated row/col
            if (vp.node.left != null) {
                q.add(new VerticalPair(vp.node.left, vp.lv + 1, vp.vt - 1));
            }
            if (vp.node.right != null) {
                q.add(new VerticalPair(vp.node.right, vp.lv + 1, vp.vt + 1));
            }
        }

        // prepare result
        List<List<Integer>> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            List<VerticalPair> ll = map.get(key);

            // sort by row first, then by value
            Collections.sort(ll, new Comparator<VerticalPair>() {
                @Override
                public int compare(VerticalPair o1, VerticalPair o2) {
                    if (o1.lv == o2.lv) {
                        return o1.node.val - o2.node.val;
                    }
                    return o1.lv - o2.lv;
                }
            });

            // collect values
            List<Integer> list = new ArrayList<>();
            for (VerticalPair v : ll) {
                list.add(v.node.val);
            }
            ans.add(list);
        }

        return ans;
    }

    public class VerticalPair {
        TreeNode node;
        int lv; // row (level)
        int vt; // column
        public VerticalPair(TreeNode node, int lv, int vt) {
            this.node = node;
            this.lv = lv;
            this.vt = vt;
        }
    }
}
