/* Created by Rayhan Chowdhury 
 * 4/9/2017
 * Lab: Wed 10:25
 */

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		Stack stack = new Stack();
		Stack stack1 = new Stack();
	
		System.out.println("This is to test push and pop for stack");
		System.out.println(" ");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.print();
		stack.pop();
		stack.peek();
		System.out.println("=====");
		System.out.println("the 4 should disapear here");
		System.out.println(" ");
		stack.print();
		System.out.println("=====================");
		
		System.out.println("This is to test enqueue and dequeue for queue above");
		System.out.println(" ");
		queue.enqueue("10");
		queue.enqueue("20");	
		queue.enqueue("30");
		queue.enqueue("40");
		queue.print();
		System.out.println("=====");
		System.out.println("the 10 should disapear here");
		System.out.println(" ");
		queue.dequeue();
		queue.print();
		System.out.println("=====================");
		
		System.out.println("This is to move contents of stack to queue");
		System.out.println(" ");
		queue.enqueue(stack.pop());
		queue.print();
		System.out.println("=====");
		System.out.println("Notice the 3 disapeared from the stack but was added to queue");
		System.out.println(" ");
		stack.print();
		
		System.out.println("=====================");
		System.out.println("This is to move contents of queue to stack");
		System.out.println("The 3 was last poped from the stack and then added to queue");
		System.out.println("but because we dequeued it was added back to stack");
		System.out.println(" ");
		stack.push(queue.dequeue());
		stack.print();
		
		System.out.println("=====================");
		System.out.println("This is to move contents of stack to stack1");
		System.out.println(" ");
		stack1.push(stack.pop());
		stack1.print();
		System.out.println("=====");
		System.out.println("let move another value and see what stack1 prints");
		System.out.println(" ");
		stack1.push(stack.pop());
		stack1.print();
		System.out.println("=====");
		System.out.println("whats left in the first stack is the value 1");
		System.out.println(" ");
		stack.print();
		
		
		
		
	}
	

}
