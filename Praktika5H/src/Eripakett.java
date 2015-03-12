
public class Eripakett extends Pakett {
	private int soodusR�hm;
	private double soodusHind;
	public Eripakett(String reis, int kestvus, double maksumusIn, int maxIn,
			int soodusR�hm, double soodus) {
		super(reis, kestvus, maksumusIn, maxIn);
		if (soodusR�hm > maxIn) {
			this.soodusR�hm = maxIn;
		} else {
			this.soodusR�hm = soodusR�hm;
		}
		this.soodusHind = soodus;
	}
	
	public double ReisiMaksumus(int i){
		if (KasSobib(i)) {
			if (soodusR�hm > i) {
				return i*getMaksumusIn();
			} else {
				return i*soodusHind;
			}
		} else {
			return -1;
		}
	}
	
	public String toString() {
		return super.toString() + "\nKui tuleb v�hemalt " + soodusR�hm + " inimest on hind inimese kohta " + soodusHind;
	}
	
}
