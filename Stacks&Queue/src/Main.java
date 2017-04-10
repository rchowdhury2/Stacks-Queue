
public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		Stack stack = new Stack();
		
		//Integer.parseInt("2")
		System.out.println("This is to test push, pop and peek for stack");
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.print();
		stack.pop();
		stack.peek();
		System.out.println("=====");
		stack.print();
		System.out.println("=========");
		
		System.out.println("This is to test enqueue, dequeue and peek for queue");
		queue.enqueue("10");
		queue.enqueue("20");	
		queue.enqueue("30");
		queue.print();
		queue.peek();
		System.out.println("=====");
		queue.dequeue();
		queue.print();
		
	}

}
