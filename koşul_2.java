public class koşul_2 {
	public static void main (String [] args) {
		int x = 20;
		int y = 30;
		if (x>y) {
			System.out.println("x,y'den büyüktür");
		} else {
			System.out.println("x,y'den küçüktür");
		}
		System.out.println(x>y ? "x,y'den büyüktür" : "x,y'den küçüktür");
}
}
