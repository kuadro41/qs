import java.util.*;

public class koşul_operatörü{
	public  static void  main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Yaşınızı giriniz: ");
		int age = scanner.nextInt();
		System.out.println(age >= 18 ? "mekana girebilirsiniz" : "lütfen dışarı çıkın");	
	}
}
