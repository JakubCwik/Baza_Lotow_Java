package Projekt;

	@SuppressWarnings("serial")
	public class Pierwsza_Litera extends Exception
	{

		String login;
		
		Pierwsza_Litera(String login)
		{
			this.login = login;
		}
		
		@Override
		public String getMessage()
		{
			return "Login musi mieæ du¿¹ pierwsz¹ literê";
		}
		
}

