
public class Maanteel extends Maas {
	String nimi;

	public Maanteel(double kiirus, int reisijateArv, int mass, int s�idukaugus, String nimi) {
		super(kiirus, reisijateArv, mass, s�idukaugus);
		this.nimi = nimi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	
}
