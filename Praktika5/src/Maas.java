
public class Maas extends Reisimisvahendid {
	private int mass;
	

	public Maas(double kiirus, int reisijateArv, int mass, int s�idukaugus) {
		super(kiirus, reisijateArv, s�idukaugus);
		this.mass = mass;
	}

	public int getMass() {
		return mass;
	}
	
	public void MassiKiiruseSuhe(){
		
	}
	
}
