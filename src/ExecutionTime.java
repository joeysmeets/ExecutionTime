
public class ExecutionTime {
	
	public static void main(String[] args) {
		long sum = 0;
		int n = 10000;
		
//		// Fragment #1  -> 0(N) The operations increase linear to the N-increase.
//		for (int i = 0; i < n; i ++) {
//			sum++;
//		}
//		
//		// Fragment #2  --> 0(Nˆ2) The operations increase exponentially once N in
//		for (int i = 0; i < n; i ++) {
//		    for ( int j = 0; j < n; j ++) { 
//		        sum++;
//		    }
//		}
//	
//		// Fragment #3 
//		for (int i = 0; i < n; i ++) { 
//		    for ( int j = i; j < n; j ++) {
//		        sum++;
//		    }   
//		}
//	
//		// Fragment #4 --> N * N --> 0(2N) = 0(N) 
//		for (int i = 0; i < n; i ++) {
//		    sum ++; 
//		}
//		for (int j = 0; j < n; j ++) {
//	        sum ++;
//		}
//	
//		// Fragment #5 
//		for (int i = 0; i < n; i ++) {
//		    for (int j = 0; j < n*n; j ++) {
//		    sum++;
//		    }
//		}
//	
//		// Fragment #6
//		for (int i = 0; i < n; i ++) {
//		    for (int j = 0; j < i; j ++) { 
//		        sum++;
//		    }
//		}
//	
//		// Fragment #7
//		for (int i = 1; i < n; i ++) {
//			for (int j = 0; j < n*n; j ++) {
//		        if (j % i == 0) {
//		           for (int k = 0; k < j; k++) {
//		               sum++;
//		           }
//		        }
//			}
//		}
//	
//		// Fragment #8 
//		int i = n;
//		while (i > 1) { 
//		    i = i / 2; 
//		    sum++; 
//		}
		System.out.println( sum);
	}
}
