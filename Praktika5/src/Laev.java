
public class Laev extends Vees {
	String nimi;

	public Laev(double kiirus, int reisijateArv, int sõidukaugus,
			int veeväljasurve, String nimi) {
		super(kiirus, reisijateArv, sõidukaugus, veeväljasurve);
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	
}
