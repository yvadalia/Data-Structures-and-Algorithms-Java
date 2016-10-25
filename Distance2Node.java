public class Distance2Node {
	public int findDistance(Node root, int n1, int n2) {
		int x = pathLength(root, n1) - 1;
		int y = pathLength(root, n2) - 1;
		int lcaData = findLCA(root, n1, n2).data;
		int lcaDistance = Pathlength(root, lcaData) - 1;
		return (x + y) - 2 * lcaDistance;
	}

	public int pathLength(Node root, int n1) {
		if (root != null) {
			int length = 0;
			if ((root.data == n1) || (length = pathLength(root.left, n1)) > 0 || (length = pathLength(root.right, n1)) > 0) {
				
				return length + 1;
			}
			return 0;
		}
		return 0;
	}

	public Node findLCA(Node root, int n1, int n2) {
		if (root != null) {
			if (root.data == n1 || root.data == n2) {
				return root;
			}
			Node left = findLCA(root.left, n1, n2);
			Node right = findLCA(root.right, n1, n2);

			if (left != null && right != null) {
				return root;
			}
			if (left != null) {
				return left;
			}
			if (right != null) {
				return right;
			}
		}
		return null;
	}
}
