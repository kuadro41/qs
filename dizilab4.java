import java.util.*;


public class dizilab4 {

	public static void main (String [] args ) {
		int [] numbers = {1,5,548,5,5,2,-9};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers,-9));
		
		int [] copyOf = Arrays.copyOf(numbers, 8);
		System.out.println(Arrays.toString(copyOf));
		
		int [] copyOfRange = Arrays.copyOfRange(numbers, 2, 5);
		System.out.println(Arrays.toString(copyOfRange));
		
		Arrays.fill(numbers, 88);
		System.out.println(Arrays.toString(numbers));
	}
}
