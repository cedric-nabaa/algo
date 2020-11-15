package learning.algo.tree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Feb 10, 20197:09:02 PM
 *
 * @author cedric
 *
 */
public class BinarySearchTreeTest {

	@Test
	public void test_insert() {
		final Tree tree = new BinarySearchTree(new Node(100));
		tree.insert(101);
		Assertions.assertThat(tree.find(101)).isEqualTo(101);
		Assertions.assertThat(tree.find(102)).isEqualTo(-1);
	}
}
