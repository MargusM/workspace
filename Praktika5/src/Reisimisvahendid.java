
public class Reisimisvahendid {
	private double kiirus;
	private int reisijateArv;
	private int s�idukaugus;
	
	
	public Reisimisvahendid(double kiirus, int reisijateArv, int s�idukaugus) {
		this.kiirus = kiirus;
		this.reisijateArv = reisijateArv;
		this.s�idukaugus = s�idukaugus;
	}
	public double getKiirus() {
		return kiirus;
	}
	public double getReisijateArv() {
		return reisijateArv;
	}
	
	public String toString() {
		return "Reisivahendi kiirus on " + kiirus + ", reisijate arv on " + reisijateArv + " ja s�idukaugus on " + s�idukaugus;
	}
	
	public static void v�ljasta(Object o){
	    System.out.println(o.toString());
	}
	
	public int Reisiaeg(){
		return (int)s�idukaugus/(int)kiirus*60;
	}
	
}
