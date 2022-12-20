import java.util.*;


public class koşullu_Dallanma2 {
	public static void main (String[]args) {
		System.out.print("lütfen bir sayı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean x = number > 0;		
		if(x) {
			System.out.println("pozitif bir sayıdır");
		} else {
			System.out.println("negatif bir sayıdır");
		}
		System.out.println("Burası her zaman çalışacak");
	}
}
