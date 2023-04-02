import java.util.*;

class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		queue1.offer("Abeokuta");
		queue1.offer("Akure");
		queue1.offer("Ibadan");
		queue1.offer("Lagos");
		
		System.out.println("Priority queue using Comparable:");
		while (queue1.size() > 0) {
			System.out.print(queue1.remove() + " ");
		}
		
		PriorityQueue<String> queue2 = new PriorityQueue(4, Collections.reverseOrder());
		queue2.offer("Abeokuta");
		queue2.offer("Akure");
		queue2.offer("Ibadan");
		queue2.offer("Lagos");
		
		System.out.println("\nPriority queue using Comparator:");
		while (queue2.size() > 0) {
			System.out.print(queue2.remove() + " ");
		}
	}
}

