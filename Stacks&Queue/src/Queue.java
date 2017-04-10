/* Created by Rayhan Chowdhury 
 * 4/9/2017
 * Lab: Wed 10:25
 */

public class Queue {
	private static class Node{
		private String data;
		private Node next;
		
		private Node(String data){
			this.data = data;
		}
		public String Data(){
			return data;
		}
	}

	private Node head;
	private Node tail;
	
	public boolean isEmpty(){
		return head == null;
	}
	public String peek(){
		return head.data;
	}
	public void enqueue(String data){ 
		Node node = new Node(data);
		if (tail != null){
			tail.next = node;
		}
		tail = node;
		if (head == null){
			head = node;
		}
	}
	public String dequeue(){
		String data = tail.data;
		head = head.next;
		if (head == null){
			tail = null;
		}
		return data;
		}
	
	public void print(){
		Node current = head;
		while(current != null){
			System.out.println(current.Data());
			current = current.next;
		}
	}
}

	


