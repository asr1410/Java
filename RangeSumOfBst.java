// /**
// * RangeSumOfBst
// */
// public class RangeSumOfBst {
// public int rangeSumBST(TreeNode root, int L, int R) {

// if(root==null)
// return 0;

// else if(L<=root.val&&root.val<=R)
// return rangeSumBST(root.left,L,R)+rangeSumBST(root.right,L,R)+root.val;

// else if(L>root.val)
// return rangeSumBST(root.right,L,R);

// else
// return rangeSumBST(root.left,L,R);
// }
// public static void main(String[] args) {

// }
// }