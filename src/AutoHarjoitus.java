
public class AutoHarjoitus {

	public static void main(String[] args) {

		Auto auto1 = new Auto();
		auto1.merkki="Audi";
		auto1.malli="S3";
		auto1.bensanMaara= 20;
		auto1.naytaTiedot();
		auto1.kiihdyta();
		
		
		

	}

}

class Auto {
	
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	
	public void jarruta()

	{
		System.out.println("Auto Jarruttaa");
	}
	
	public void kiihdyta ()
	{if (bensanMaara>0)
	
	{	System.out.println("Auto kiihtyy");
		bensanMaara = bensanMaara -1;
	}
	}
	
	public void naytaTiedot()
	{
		System.out.println("Merkki: " +merkki + " Malli: " + malli + " Bensan määrä: " + bensanMaara);
	}
	
	public void tankkaa(int maara)
	{
		if (maara>0)
		{
			System.out.println("Tankissa bensaa: "+ bensanMaara);
			System.out.println("Tankkaus: " + maara);
			System.out.println("Tankissa bensaa tankkauksen jälkeen: " + maara + bensanMaara);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}