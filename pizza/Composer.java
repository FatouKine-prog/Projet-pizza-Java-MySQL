package pizza;

public class Composer {

	private int NROPIZZ;
	private String CODEINGR;
	private String QTECOMP;


	public Composer(int nROPIZZ, String cODEINGR, String qTECOMP) {
		super();
		this.NROPIZZ = nROPIZZ;
		this.CODEINGR = cODEINGR;
		this.QTECOMP = qTECOMP;
	}


	public int getNROPIZZ() {
		return NROPIZZ;
	}


	public void setNROPIZZ(int nROPIZZ) {
		NROPIZZ = nROPIZZ;
	}


	public String getCODEINGR() {
		return CODEINGR;
	}


	public void setCODEINGR(String cODEINGR) {
		CODEINGR = cODEINGR;
	}


	public String getQTECOMP() {
		return QTECOMP;
	}


	public void setQTECOMP(String qTECOMP) {
		QTECOMP = qTECOMP;
	}


	@Override
	public String toString() {
		return " [NROPIZZ=" + NROPIZZ + ", CODEINGR=" + CODEINGR + ", QTECOMP=" + QTECOMP + "]";
	}
	

	
	
}
