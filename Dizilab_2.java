import java.util.*;

public class Dizilab_2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizi uzunluğu:");
		int length = scanner.nextInt();
		int[] numbers = new int [length];
		for (int i = 0;i < numbers.length; i++) {
			System.out.print((i+1)  +". Sayı:");
			numbers[i] = scanner.nextInt();
		}
		System.out.println(Arrays.toString(numbers));	
		
		int total = 0;
		for (int i = 0;i < numbers.length; i++) {
			total = total + numbers[i];
		}
		System.out.println(total/ numbers.length);
	}
}
