
public class Coins
	{
		public static void main(String[] args)
		{
			int Cents_user = Integer.parseInt(args[0]);
			int Quarters = Cents_user/25;
			int Cents_final = Cents_user%25;
			System.out.println("Use " + Quarters + " quarters" + " and " + Cents_final + " cents ");
			
		}
	}
