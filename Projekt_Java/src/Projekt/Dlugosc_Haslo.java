package Projekt;

@SuppressWarnings("serial")
public class Dlugosc_Haslo extends Exception
{
	String haslo;
	
	Dlugosc_Haslo(String haslo)
	{
		this.haslo=haslo;
	}
	
	@Override
	public String getMessage()
	{
		return "Has³o musi mieæ przynajmniej 8 znaków!";
	}
	
}
