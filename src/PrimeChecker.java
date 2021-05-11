import java.util.Random;

public class PrimeChecker {
	
	public static void main(String[] args) {
		
		//parts to fill the Array with random 20 or 40 bit numbers. 
		Random r = new Random();
		long low = 1;
		// for 20 Bit numbers
		long max20 = 1048576;
		// for 40 Bit numbers
		long max40 = 1099511627776;
		long result1 = r.nextLong(max20 - low) + low;
		long result2 = r.nextLong(max40 - low) + low;
	
	public static boolean isPrime (Long n) {
		String b = Long.toBinaryString(n);
		if (n % 2 == 0) {
			return true;
		} 
		return false;

	}
	
	}
}
