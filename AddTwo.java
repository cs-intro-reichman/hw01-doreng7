
public class AddTwo
	{
		public static void main(String[] args)
		{
			//that adds two given integers and prints the result in a fancy way
		
			int Num1 = Integer.parseInt(args[0]);
			int Num2 = Integer.parseInt(args[1]);
			int Sum = Num1+Num2;
			
			System.out.println(Num1 + " + " + Num2 + " = " +Sum);
		}
	}