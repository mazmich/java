public abstract class ArtykulSklepowy {
 
	  protected double cena;
	  protected String kodKreskowy;
	  private Date terminPrzydatnosci; // jak zaprojektowaæ klasê Date?
 
	  // konstruktor
	  public ArtykulSklepowy(double cena, String kodKreskowy, Date terminPrzydatnosci){
	    this.cena = cena;
	    this.kodKreskowy = kodKreskowy;
	    this.terminPrzydatnosci = terminPrzydatnosci;
	  }
 
	  // gettery i settery do pól 
	  // ....
 
	  public boolean czySwiezy(){
	    return new Date().getTime() < terminPrzydatnosci.getTime();
	  }
 
	  public abstract boolean czyPromocjaZProduktem(String kodKreskowyInnegoProduktu);
 
	  // gettery i settery do pól 
	  // ....
 
}