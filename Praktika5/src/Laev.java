
public class Laev extends Vees {
	String nimi;

	public Laev(double kiirus, int reisijateArv, int s�idukaugus,
			int veev�ljasurve, String nimi) {
		super(kiirus, reisijateArv, s�idukaugus, veev�ljasurve);
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	
}
