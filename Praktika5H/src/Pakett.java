
public class Pakett {
	private String reis;
	private int kestvus;
	private double maksumusIn;
	private int maxIn;
	
	
	
	public Pakett(String reis, int kestvus, double maksumusIn, int maxIn) {
		this.reis = reis;
		this.kestvus = kestvus;
		this.maksumusIn = maksumusIn;
		this.maxIn = maxIn;
	}
	public String getReis() {
		return reis;
	}
	public int getKestvus() {		
		return kestvus;
	}
	public double getMaksumusIn() {
		return maksumusIn;
	}
	public int getMaxIn() {
		return maxIn;
	}
	
	boolean KasSobib(int i) {
		if (i > maxIn) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public double ReisiMaksumus(int i){
		if (KasSobib(i)) {
			return i*maksumusIn;
		} else {
			return -1;
		}
	}
	
	public String toString() {
		if (kestvus > 24) {
			return reis + " kestab " + kestvus/24 + "p " + kestvus%24 + "h ja maksab " + maksumusIn + " inimese kohta";
		}
		else {
			return reis + " kestab " + kestvus + "h ja maksab " + maksumusIn + " inimese kohta";
		}
	}
	
}
