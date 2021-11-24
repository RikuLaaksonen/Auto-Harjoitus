
public class AutoHarjoitus {

	public static void main(String[] args) {

//		Auto auto1 = new Auto();
//		auto1.merkki="Audi";
//		auto1.malli="S3";
//		auto1.bensanMaara= 20;
//		auto1.naytaTiedot();
//		auto1.kiihdyta();
		
		Auto auto2 = new Auto("BMW", "M3", 9);
		auto2.naytaTiedot();
		auto2.jarruta();
		auto2.kiihdyta();
		auto2.naytaTiedot();
		auto2.tankkaa(0);
		
	}

}

class Auto {
	
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	public Auto()
	{
		merkki ="";
		malli= "";
		
	}
	
	public Auto (String merkinNimi, String mallinNimi, int bensa)
	{
		merkki = merkinNimi;
		malli = mallinNimi;
		bensanMaara = bensa;
	}
	
	public void jarruta()

	{
		System.out.println("Auto jarruttaa");
	}
	
	public void kiihdyta ()
	{if (bensanMaara>0)
	
	{	System.out.println("Auto kiihtyy");
		bensanMaara = bensanMaara -1;
	}
	}
	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " +merkki);
		System.out.println("Malli: " + malli);
		System.out.println("Bensan määrä: " + bensanMaara);
		
	}
	
	public void tankkaa(int maara)
	{
		if (maara>0)
		{
			System.out.println("Tankissa bensaa: "+ bensanMaara);
			System.out.println("Tankkaus: " + maara);
			System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (maara + bensanMaara));
		}
		
		
	}
}