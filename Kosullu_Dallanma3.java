import java.util.*;


public class Kosullu_Dallanma3 {
	public static void main (String[]args) {
		System.out.print("lütfen bir sayı giriniz: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean x = number  %2 == 0 ;		
		if(x) {
			System.out.println("çift bir sayıdır.");
		} else {
			System.out.println("tek bir sayıdır.");
		}
	}
