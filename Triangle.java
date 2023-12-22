
public class Triangle
	{
		public static void main(String[] args)
		{
			//program that gets 3 lenghs and prints "true" if these 3 lenghs can form a triangle, otherwise prints "false"
			int Side1 = Integer.parseInt(args[0]);
			int Side2 = Integer.parseInt(args[1]);
			int Side3 = Integer.parseInt(args[2]);
			boolean Triangle = (Side1 + Side2) > Side3 && (Side1 +Side3) > Side2 && (Side2 + Side3) > Side1;
			System.out.println(Side1 + ", " + Side2 + ", " + Side3 + ": " + Triangle);
			
		}
	}
