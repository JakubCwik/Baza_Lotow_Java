package Projekt;

@SuppressWarnings("serial")
public class Haslo_Znak extends Exception
{
	String haslo;
	public Haslo_Znak(String haslo) 
	{
		this.haslo = haslo;
	}
	
	@Override
	public String getMessage()
	{
		return "Has�o musi mie� przynajmniej 1 du�� liter�!";
	}
}
