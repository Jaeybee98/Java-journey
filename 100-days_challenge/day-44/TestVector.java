import java.io.*;
import java.util.*;

class TestVector {
	public static void main(String[] args) {
		int n = 5;
		Vector<Integer> vector = new Vector<Integer>(n);

		for (int i = 1; i <= n; i++)
			vector.add(i);

		System.out.println(vector);
		vector.remove(3);
		System.out.println(vector);

		for (int i = 0; i < vector.size(); i++)
			System.out.print(vector.get(i) + " ");
	}
}
