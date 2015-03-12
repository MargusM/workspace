
public class TestPunkt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinuPunkt p1 = new MinuPunkt();
		MinuPunkt p2 = new MinuPunkt(3, 5);
		MinuPunkt p3 = new MinuPunkt(4, 2, 6);
		
		System.out.println("Minu punktid on:");
		System.out.println("p1:\n" + p1);
		System.out.println("p2:\n" + p2);
		System.out.println("p3:\n" + p3);
		
		//muudan punti p1 koordinaate
		
		p1.translate(2, 3, 4);
		System.out.println("Punkt p1 nüüd selline:");
		System.out.println(p1);
		
		//p2'e muudan sama suguseks, nagu p3
		
		p2.setLocation(p3);
		System.out.println("Punkt p2 nüüd sama, mis p3");
		System.out.println(p2);
		
		MinuPunkt[] pArray = new MinuPunkt[3];
		pArray[0] = p1;
		pArray[1] = p2;
		pArray[2] = p3;
		
		MinuPunkt kokkuLiidetud = new MinuPunkt(LiidaKoordinaate(pArray));
		//nende kolme punkti kokku liitmisel saame
		System.out.println("Nende kolme punkti kokku liitmisel saame punkti");
		System.out.println(kokkuLiidetud);
		
	}
	
	public int KoordinaatideSumma(MinuPunkt p){
		return p.x + p.y + p.z;
	}
	
	public static MinuPunkt LiidaKoordinaate(MinuPunkt[] p){
		
		MinuPunkt pS = new MinuPunkt();
		
		for (int i = 0; i < p.length; i++) {
			pS.translate(p[i].x, p[i].y, p[i].z);
		}
		
		return pS;
	}

}
