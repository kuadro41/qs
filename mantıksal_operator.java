public class mantıksal_operator {
	public static void main (String[]args) {
		boolean a = false ;
		boolean b = true;
		boolean c = true;
		boolean d = false;
		
		
		System.out.println(a && b);
		System.out.println(a && d);
		System.out.println(b && a);
		System.out.println(b && c);
		
		
		System.out.println(a || b);
		System.out.println(a || d);
		System.out.println(b || a);
		System.out.println(b || c);	
	}
}
