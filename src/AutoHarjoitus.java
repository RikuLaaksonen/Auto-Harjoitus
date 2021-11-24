
public class AutoHarjoitus {

	public static void main(String[] args) {


	}

}

class Auto {
	
	public String merkki;
	public String malli;
	public int bensanMaara;
	
	
	public void Jarruta()

	{
		System.out.println("Auto Jarruttaa");
	}
	
	public void Kiihdyta ()
	{
		System.out.println("Auto kiihtyy");
		bensanMaara = bensanMaara -1;
	}
	
	public void NaytaTiedot()
	{
		System.out.println(merkki + malli + bensanMaara);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}