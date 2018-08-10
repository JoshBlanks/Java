// Fibonacci sequence: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ... 

public class Fibonacci {
	
	/*
	 * Time Complexity: O(2^n)
	 * Space: O(1)
	 */
	
	public static int fibRec(int n) {
		if(n == 1 || n == 0) return n;
		
		return fibRec(n - 1) + fibRec(n - 2);
	}
	
	/*
	 *  Time Complexity: O(n)
	 *	Space: O(1)
	*/
	public static int fibDyn(int n) {
		int first = 1, second = 0, current = 0;
		
		if(n <= 1) return n;
		
		for(int i = 2; i < n + 1; i++) {
			current = first + second;
			second = first;
			first = current;
		}
		
		return current;
	}
	
	public static void main(String[] args) {
		System.out.println("Recursive result: " + fibRec(10));
		System.out.println("Dynamic result: " + fibDyn(10));
	}
}
