
public class Eripakett extends Pakett {
	private int soodusRühm;
	private double soodusHind;
	public Eripakett(String reis, int kestvus, double maksumusIn, int maxIn,
			int soodusRühm, double soodus) {
		super(reis, kestvus, maksumusIn, maxIn);
		if (soodusRühm > maxIn) {
			this.soodusRühm = maxIn;
		} else {
			this.soodusRühm = soodusRühm;
		}
		this.soodusHind = soodus;
	}
	
	public double ReisiMaksumus(int i){
		if (KasSobib(i)) {
			if (soodusRühm > i) {
				return i*getMaksumusIn();
			} else {
				return i*soodusHind;
			}
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return super.toString() + "\nKui tuleb vähemalt " + soodusRühm + " inimest on hind inimese kohta " + soodusHind;
	}
	
}
