import java.time.DayOfWeek;

public enum aylar {
	ocak,şubat,mart,nisan,mayıs,haziran,temmuz,ağustos,eylül,ekim,kasım,aralık
}

public class enuma {
	public static void main (String [] args ) {
		aylar[] values = aylar.values();
		for(int i = 0; i< values.length ; i++) {
			System.out.println(values[i]);
		}
		aylar valueOf = aylar.valueOf("ekim");
		System.out.println(valueOf);
		
		
		DayOfWeek s = DayOfWeek.SUNDAY;
		System.out.println(s);
		
		DayOfWeek se = DayOfWeek.of(5);
		System.out.println(se);	
	}	
}
