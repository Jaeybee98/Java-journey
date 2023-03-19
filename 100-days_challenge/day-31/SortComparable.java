import java.math.*;
import java.util.Arrays;

class SortComparable {
	public static void main(String[] args) {
		String[] cities = {"Abeokuta", "Lagos", "Ibadan", "Akure"};
		Arrays.sort(cities);
		for (String city: cities)
			System.out.print(city + " ");
		System.out.println();

		BigInteger[] hugeNumbers = {new BigInteger("232323109292992"), new BigInteger("4322232323239292"), new BigInteger("54623239292")};
			Arrays.sort(hugeNumbers);
			for (BigInteger number: hugeNumbers)
				System.out.print(number + " ");
	}
}
