
public class Vees extends Reisimisvahendid {
	private int veev�ljasurve;
	
	
	public Vees(double kiirus, int reisijateArv, int s�idukaugus,
			int veev�ljasurve) {
		super(kiirus, reisijateArv, s�idukaugus);
		this.veev�ljasurve = veev�ljasurve;
	}


	public int getVeev�ljasurve() {
		return veev�ljasurve;
	}
	
	
}
