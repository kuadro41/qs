public class String  {
	public static void main (String[] args) {
		String FirstName = "joe" ; // isim tanımlama
		System.out.println(FirstName.charAt(1));// charAt komutu belirtilen konumda ki harfi yazdırır
		System.out.println(FirstName.charAt(0));// charAt komutu belirtilen konumda ki harfi yazdırır
		System.out.println(FirstName.charAt(2));// charAt komutu belirtilen konumda ki harfi yazdırır
		System.out.println(FirstName.toUpperCase());//toUpperCase tanımlanan kelimede ki harfleri büyütür
		System.out.println(FirstName.toLowerCase());//toLowerCase tanımlanan kelimede ki harfleri küçültür
		System.out.println(FirstName.replace('e', ('a') ));//replace komutu tanımlanan kelimede ki harfi değiştirir
		System.out.println(FirstName.length());// length komutu tanımlanan kelimenin uzunluğunu verir
		System.out.println(FirstName.substring(1));// substring komutu belirlenen konumdan başlayarak kelimenin devamını getirir
		System.out.println(FirstName);		
	}
}
