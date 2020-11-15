package learning.algo.tree;

/**
 * Feb 10, 20196:28:09 PM
 *
 * @author cedric
 *
 */
public class BinarySearchTree implements Tree {

	private final Node root;

	public BinarySearchTree(final Node root) {
		this.root = root;
	}

	@Override
	public void insert(Integer i) {
		// insert2(root, root, i);
		addRecursive(root, i);
	}

	private void insert2(Node parentNode, Node node, Integer valueToInsert) {
		if (node == null) {
			node = new Node(valueToInsert);
			if (node.value < parentNode.value) {
				parentNode.leftNode = node;
			} else {
				parentNode.rightNode = node;
			}
		}
		if (valueToInsert < node.value) {
			insert2(node, node.leftNode, valueToInsert);
		} else if (valueToInsert > node.value) {
			insert2(node, node.rightNode, valueToInsert);
		}

	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.leftNode = addRecursive(current.leftNode, value);
		} else if (value > current.value) {
			current.rightNode = addRecursive(current.rightNode, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

	@Override
	public Integer find(Integer t) {
		Node n = root;
		do {
			if (n.value == t) {
				return t;
			} else if (t < n.value) {
				if (n.leftNode != null) {
					n = n.leftNode;
				} else {
					return -1;
				}
			} else if (t > n.value) {
				if (n.rightNode != null) {
					n = n.rightNode;
				} else {
					return -1;
				}
			}
		} while (n.leftNode == null && n.rightNode == null); // condiiton to hit a leaf level
		return t;
	}

	@Override
	public Integer findRecursive(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traverse() {

	}

}