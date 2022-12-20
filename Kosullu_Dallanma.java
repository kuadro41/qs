public class Kosullu_Dallanma {
	public static void main (String[]args) {
		int number = 10;
		boolean x = number < 0;
		boolean y = number > 0;		
		if(x) {
			System.out.println("pozitif bir sayıdır");
			System.out.println("2.");
		}
		if(y) {
			System.out.println("pozitif bir sayıdır"); // boolean false olduğundan ikinci kez çalışmamıştır
			System.out.println("2.");
		}
		System.out.println("Burası her zaman çalışacak");
	}
}
