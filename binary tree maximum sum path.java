public int maxPathSum(TreeNode root) {
  int[] max = new int[1];
  max[0] = Integer.MIN_VALUE;
  computeSum(root,max);
  return max[0];
}

public int computeSum(TreeNode root, int[] max){
  if(root == null) return 0;
  
  int left = computeSum(root.left, max);
  int right = computeSum(root.right, max);
  
  int current = Math.max(max[0],Math.max(root.value + left, root.value+right));
  max[0] = Math.max(max[0], Math.max(current, root.value+left+right));
  
  return current;
}
