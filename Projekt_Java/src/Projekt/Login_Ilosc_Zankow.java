package Projekt;

@SuppressWarnings("serial")
public class Login_Ilosc_Zankow extends Exception
{
	String login;
	Login_Ilosc_Zankow(String login)
	{
		this.login = login;
	}
	
	@Override
	public String getMessage()
	{
		return "Login musi mie� przynajmniej 6 znak�w!";
	}
}
