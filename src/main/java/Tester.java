import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tester {

	public Node rotateList(Node head, int n) {

		Node prev = null;
		Node next = head;
		int length = 1;
		while (length != n) {
			next = next.getNext();
			length++;
		}

		
		prev = next;
		while (next != null) {
			prev = next;
			next = next.getNext();
		}

		// Reverse the remaining Linked List
		Node node = prev;
		Node current = node;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		node = prev;
		Node traverse=prev;
		while(traverse.getNext()!=null){
			traverse=traverse.getNext();
		}
		traverse.setNext(head);
		head=prev;
		return head;
		
		

		//
		//return null;
	}

	public static void main(String[] args) {
		//Node nodea=new 
		
	}

}

class Node {

	private String name;
	private Node next;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
