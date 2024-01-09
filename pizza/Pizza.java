package pizza;


public class Pizza {

	private int NROPIZZ;
	private String DESIGNPIZZ;
	private double TARIFPIZZ;
	
	public Pizza(int nROPIZZ, String dESIGNPIZZ, double tARIFPIZZ) {
		super();
		this.NROPIZZ = nROPIZZ;
		this.DESIGNPIZZ = dESIGNPIZZ;
		this.TARIFPIZZ = tARIFPIZZ;
	}

	public int getNROPIZZ() {
		return NROPIZZ;
	}

	public void setNROPIZZ(int nROPIZZ) {
		NROPIZZ = nROPIZZ;
	}

	public String getDESIGNPIZZ() {
		return DESIGNPIZZ;
	}

	public void setDESIGNPIZZ(String dESIGNPIZZ) {
		DESIGNPIZZ = dESIGNPIZZ;
	}

	public double getTARIFPIZZ() {
		return TARIFPIZZ;
	}

	public void setTARIFPIZZ(double tARIFPIZZ) {
		TARIFPIZZ = tARIFPIZZ;
	}

	@Override
	public String toString() {
		return "Pizza [NROPIZZ=" + NROPIZZ + ", DESIGNPIZZ=" + DESIGNPIZZ + ", TARIFPIZZ=" + TARIFPIZZ + "]";
	}
	
	
	
}


