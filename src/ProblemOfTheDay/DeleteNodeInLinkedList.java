package ProblemOfTheDay;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class DeleteNodeInLinkedList {

	public static void main(String[] args) {
		// TODO Create linkedlist and provide the reference of the node to be deleted in deleteNode method.
	}

	public void deleteNode(ListNode node) {
		ListNode prevNode = null;
		while (node.next != null) {
			node.val = node.next.val;
			prevNode = node;
			node = node.next;
		}
		prevNode.next = null;
	}

}
