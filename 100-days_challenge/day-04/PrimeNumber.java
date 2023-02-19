class PrimeNumber {
	public static void main(String[] args) {
		//initialise the number of prime numbers to display
		final int NUMBER_OF_PRIMES = 50;

		//initialise th number of primes numbers per line
		final int NUMBER_OF_PRIMES_PER_LINE = 10;

		//count the number of prime numbers
		int count = 0;
		int number = 2;

		System.out.println("The first 50 prime numbers are \n");

		//find prime number repeatedly
		while (count < NUMBER_OF_PRIMES) {
			boolean isPrime = true;

			//test whether number is prime
			for( int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.println(number);
				}
				else
					System.out.print(number + " ");
			}

			number++;
		}
	}
}

