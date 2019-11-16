public class Jablko extends ArtykulSklepowy {
 
	private String gatunek;
 
	public Jablko(double cena, String kodKreskowy, Date terminPrzydatnosci, String gatunek) {
		super(cena, kodKreskowy, terminPrzydatnosci);
		this.gatunek = gatunek;
	}
 
	@Override
	public boolean czyPromocjaZProduktem(String kodKreskowyInnegoProduktu) {
		return "1k334jj".equals(kodKreskowyInnegoProduktu);
	}
 
	// gettery i settery dla nowych p�l. Dla p�l z nadklasy zosta�y odziedziczone
 
}