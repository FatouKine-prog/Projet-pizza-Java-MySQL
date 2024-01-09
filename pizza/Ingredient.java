package pizza;

public class Ingredient {

	private String CODEINGR;
	private String NOMINGR;
	private String UNITEINGR;
	
	
	public Ingredient(String cODEINGR, String nOMINGR, String uNITEINGR) {
		super();
		this.CODEINGR = cODEINGR;
		this.NOMINGR = nOMINGR;
		this.UNITEINGR = uNITEINGR;
	}
	
	
	
	public String getCODEINGR() {
		return CODEINGR;
	}
	public void setCODEINGR(String cODEINGR) {
		CODEINGR = cODEINGR;
	}
	public String getNOMINGR() {
		return NOMINGR;
	}
	public void setNOMINGR(String nOMINGR) {
		NOMINGR = nOMINGR;
	}
	public String getUNITEINGR() {
		return UNITEINGR;
	}
	public void setUNITEINGR(String uNITEINGR) {
		UNITEINGR = uNITEINGR;
	}
	
	
	
	@Override
	public String toString() {
		return "Ingredient [CODEINGR=" + CODEINGR + ", NOMINGR=" + NOMINGR + ", UNITEINGR=" + UNITEINGR + "]";
	}
	
	
		
	

	
}
