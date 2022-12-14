public class mantıksal_operatörler2 {
	public static void main (String [] args ) {
		boolean x = false ;
		System.out.println(x);
		
		System.out.println(!x);
		
		System.out.println(x & false); // false & false =  false
		System.out.println(x & true);  // false & true  =  false 
		
		System.out.println(x | false); // false | false =  false
		System.out.println(x | true);  // false | true  =  true 		
	}
}
