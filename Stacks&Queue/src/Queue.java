
public class Queue {
	private static class Node{
		private int data;
		private Node next;
		
		private Node(int data){
			this.data = data;
		}

		private Node getNext(){
			return next;
		}
		
		private int Data(){
			return data;
		}
		
		private void setData(int data) {
			this.data = data;
		}
	}
	private Node head;
	private Node tail;
	
	public boolean isEmpty(){
		return head == null;
	}
	public int peek(){
		return head.data;
	}
	public void add(int data){
		Node node = new Node(data);
		if (tail != null){
			tail.next = node;
		}
	}
	public int remove(){
		int data = tail.data;
		head = head.next;
		if (head == null){
			tail = null;
		}
		return data;
		}
	}

}

