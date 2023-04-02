import java.util.*;

class TestQueue {
	public static void main(String[] args) {
		Queue<String> queue = new java.util.LinkedList<>();
		queue.offer("Abeokuta");
		queue.offer("Akure");
		queue.offer("Ibadan");
		queue.offer("Lagos");
		
		while (queue.size() > 0)
			System.out.print(queue.remove() + " ");
	}
}
