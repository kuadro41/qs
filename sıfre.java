import java.util.Scanner;

public class sıfre {
	public static void main (String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("lütfen parolanızı girin:");
		String password = scanner.nextLine();
		boolean isOK = password.equals("1234");
		System.out.println(isOK ? "tebrikler" : "hatalı parola" );	
	}
}
