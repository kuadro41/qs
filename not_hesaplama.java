import java.util.*;

public class not_hesaplama {
	public static void main (String []args ) {
		System.out.print("Lütfen hesaplamak istediğiniz sınav notunuzu giriniz:");
		Scanner scanner = new Scanner(System.in);
		System.out.print("sınav notu:");
		int score = scanner.nextInt();
		
		if(score >= 90 && score <=100) {
			System.out.println("AA");
		} else if (score >= 85 && score <=89) {
			System.out.println("BA");
		} else if (score >= 80 && score <=84) {
			System.out.println("BB");
		} else if (score >= 75 && score <=79) {
			System.out.println("CB");
		} else if (score >= 70 && score <=74) {
			System.out.println("CC");
		} else if (score >= 65 && score <=69) {
			System.out.println("DC");
		} else if (score >= 60 && score <=64) {
			System.out.println("DD");
		} else if (score >= 50 && score <=59) {
			System.out.println("FD");
		} else if (score >= 0  && score <=49) {
			System.out.println("FF");
		} else {
			System.out.println("Hata:0-100 arası bir sayı girmediniz.");
		}
	}
}
