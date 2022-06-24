package Projekt;

@SuppressWarnings("serial")
public class Haslo_Cyfry extends Exception
{
	String haslo;
	
	public Haslo_Cyfry(String haslo) 
	{
		this.haslo=haslo;
	}
	
	@Override
	public String getMessage()
	{
		return "Has³o musi mieæ przynajmniej 1 cyfrê!";
	}
}
