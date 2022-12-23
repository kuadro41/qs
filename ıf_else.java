import java.util.Scanner;

public class ıf_else {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("lütfen bir sayı giriniz:");
		int number = scanner.nextInt();
		
		
		if(number < 100 && number >=10) {
			System.out.println("sayı iki basamaklıdır");
			} else if (number >=1 && number < 10) {
				System.out.println("sayı tek basamaklıdır");
			}
			  else if (number >= 100 && number < 1000) {
				  System.out.println("sayı üç basamaklıdır");
			}
			  else if (number >=1000 && number < 10000) {
				  System.out.println("sayı dört basamaklıdır");
			} else {
				  System.out.println("girdiğiniz sayı 1 ve 9999 arasında değildir");
			}
		}
	}
