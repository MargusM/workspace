
public class Reisimisvahendid {
	private double kiirus;
	private int reisijateArv;
	private int sõidukaugus;
	
	
	public Reisimisvahendid(double kiirus, int reisijateArv, int sõidukaugus) {
		this.kiirus = kiirus;
		this.reisijateArv = reisijateArv;
		this.sõidukaugus = sõidukaugus;
	}
	public double getKiirus() {
		return kiirus;
	}
	public double getReisijateArv() {
		return reisijateArv;
	}
	
	public String toString() {
		return "Reisivahendi kiirus on " + kiirus + ", reisijate arv on " + reisijateArv + " ja sõidukaugus on " + sõidukaugus;
	}
	
	public static void väljasta(Object o){
	    System.out.println(o.toString());
	}
	
	public int Reisiaeg(){
		return (int)sõidukaugus/(int)kiirus*60;
	}
	
}
