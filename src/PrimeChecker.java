import java.util.ArrayList;

public class PrimeChecker {
	
	public static void main(String[] args) {
		
		
	//public void FillArrayLists () {
		ArrayList<Long> numbers20Bits = new ArrayList<>();
//		ArrayList<Long> numbers40Bits = new ArrayList<>();
		//parts to fill the Array with random 20 or 40 bit numbers. 
		long low = 1;
		// for 20 Bit numbers
		long max20 = 1048576L;
		// for 40 Bit numbers
//		long max40 = 1099511627776L;
		
		long startTime = System.nanoTime();
		
		while (numbers20Bits.size() < 100) {
			long a = (long) (Math.random() * (max20 - low)) + low;
			if (a > 0) {
				numbers20Bits.add(a);
			}
		}
			
//		while (numbers40Bits.size() < 100) {
//			long b = (long) (Math.random() * (max40 - low)) + low;
//			if (b > 0) {
//				numbers40Bits.add(b);
//			}
//		}	
		
		// loop to determine 20Bit prime numbers from the ArrayList
		for (int i =0; i<numbers20Bits.size(); i++) {
			if ((isPrime(numbers20Bits.get(i)))) {
				System.out.println("The number: " + numbers20Bits.get(i) + "is Prime." );
			} else {
				System.out.println("The number: " + numbers20Bits.get(i) + "is not Prime." );
			}
		}
		long endTime20 = System.nanoTime();
		long elapedTime = endTime20 - startTime;
		System.out.println("It took the system " + elapedTime + " Nanoseconds to be done checking all 20 Bit-numbers.");
		
		// loop to determine 40Bit prime numbers from the ArrayList
//		for (int i =0; i<numbers40Bits.size(); i++) {
//			if ((isPrime(numbers40Bits.get(i)))) {
//				System.out.println("The number: " + numbers40Bits.get(i) + "is Prime." );
//			} else {
//				System.out.println("The number: " + numbers40Bits.get(i) + "is not Prime." );
//			}
//		}
//		long endTime40 = System.nanoTime();
//		long elapedTime = endTime40 - startTime;
//		System.out.println("It took the system " + elapedTime + " Nanoseconds to be done checking all 40 Bit-numbers.");
	}
	
	public static boolean isPrime(long n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {return false;}
		}
		if(n<2) return false;
		
		return true;
	}
	
	public static void bitCounter(int n) {
		//return Integer.toBinaryString(n);
		int b = 0;
		while (n > 0) {
		    b++;
		    n = n >> 1;
		}
		System.out.println(b);
	}
}