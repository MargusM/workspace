
public class Vees extends Reisimisvahendid {
	private int veeväljasurve;
	
	
	public Vees(double kiirus, int reisijateArv, int sõidukaugus,
			int veeväljasurve) {
		super(kiirus, reisijateArv, sõidukaugus);
		this.veeväljasurve = veeväljasurve;
	}


	public int getVeeväljasurve() {
		return veeväljasurve;
	}
	
	
}
