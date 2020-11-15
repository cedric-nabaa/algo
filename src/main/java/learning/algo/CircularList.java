package learning.algo;

/**
 * Jan 6, 20197:32:37 PM
 *
 * @author cedric
 *
 */
public class CircularList<E> {

	private Node<E> current;
	private int size;

	public CircularList() {
		size = 0;
	}

	public void add(E element) {
		if (this.size == 0) {
			this.current = new Node<>(element, null);
		} else {
			final Node<E> newNode = new Node<>(element, null);
			final Node<E> oldNode = current;
			if (current.nextNode == null) {
				current.nextNode = newNode;
			}
			newNode.nextNode = current;
			current = newNode;
			// to close
		}
		size++;
	}

	public E step() {
		if (current == null) {
			return null;
		}
		current = current.nextNode;
		return current.currentElement;
	}

	private static class Node<E> {
		E currentElement;
		Node<E> nextNode;

		Node(E element, Node<E> next) {
			this.currentElement = element;
			if (next == null) {
				next = this;
			} else {
				this.nextNode = next;
			}
		}

	}

}
