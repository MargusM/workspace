
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reisimisvahendid lennuk = new �hus(955, 250, 374850, "Boeing 747-200B", 12700);
		Reisimisvahendid buss = new Maanteel(100, 55, 25000, 1500, "Scania K34");
		Maas rong = new R��bateel(250, 300, 1530000, 2000, "Rong tshuu");
		Vees paat = new V�ikelaev(50, 10, 300, 4500, "Paadu");
		
		//ko
		
		paat.v�ljasta(paat);
		
		Reisimisvahendid.v�ljasta(lennuk);
		
		//Siin on tehtud t��biteisendus, et saaks k�tte buss'i nime
		System.out.println(((Maanteel)buss).getNimi() + " kulub reisi l�bimiseks " + buss.Reisiaeg());
		
	}
	
	

}
