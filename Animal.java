public class Animal implements Introducable, Artykul {
 
	private Date terminPrzydatnosci;
 
	@Override
	public boolean czySwiezy() {
		return new Date().getTime() < terminPrzydatnosci.getTime();
	}
 
	@Override
	public void introduce() {
		System.out.println("Hello. I am animal");
 
	}
 
}