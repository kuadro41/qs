import java.util.Scanner;

public class koşul_3 {
	public static void main (String [] args) {
		int x = 20;
		
		System.out.println("x = 20");
		System.out.print("karşılaştırma için değer giriniz: ");
		Scanner  scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(x>i ? "x,i'den büyüktür" : "x,i'den küçüktür");		
}
}
