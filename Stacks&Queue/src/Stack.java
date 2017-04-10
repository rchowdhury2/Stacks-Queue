/* Created by Rayhan Chowdhury 
 * 4/9/2017
 * Lab: Wed 10:25
 */

public class Stack {
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
	
	private Node top;

	public boolean isEmpty(){
		return top == null;
	}
	public String peek(){
		return top.data;
	}
	public void push(String data){
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	public String pop(){
		String data = top.data;
		top = top.next;
		return data;
		}
	public void print(){
		Node current = top;
		while(current != null){
			System.out.println(current.Data());
			current = current.next;
				
	}
	}
}


