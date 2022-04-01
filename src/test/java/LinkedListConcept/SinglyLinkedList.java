package LinkedListConcept;

public class SinglyLinkedList {
	
	Node head;
	class Node
	{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		next = null; 
		
	}
	}
	
	public void printmylinkedlist()
	{
		Node n = head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
		
	}

	public static void main(String[] args) {
		SinglyLinkedList SLL= new SinglyLinkedList();
		
		Node first = SLL.new Node(10);
		SLL.head=first;
		
		Node second = SLL.new Node(20);
		first.next=second;
		
		Node third = SLL.new Node(30);
		second.next=third;
		
		SLL.printmylinkedlist(); 
		
		

	}

}
