
public class Maas extends Reisimisvahendid {
	private int mass;
	

	public Maas(double kiirus, int reisijateArv, int mass, int sõidukaugus) {
		super(kiirus, reisijateArv, sõidukaugus);
		this.mass = mass;
	}

	public int getMass() {
		return mass;
	}
	
	public void MassiKiiruseSuhe(){
		
	}
	
}
