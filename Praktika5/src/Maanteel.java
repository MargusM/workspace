
public class Maanteel extends Maas {
	String nimi;

	public Maanteel(double kiirus, int reisijateArv, int mass, int sõidukaugus, String nimi) {
		super(kiirus, reisijateArv, mass, sõidukaugus);
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	
}
