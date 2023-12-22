
public class GenThree
	{
		public static void main(String[] args)
		{
			//program that generates 3 random integers in a given range, and prints the smallest number out of the 3
	
			int Range1 = Integer.parseInt(args[0]);
			int Range2 = Integer.parseInt(args[1]);
			int Difference = Math.abs(Range1 - Range2);
			int Min = Math.min(Range1 , Range2);
			int Random1 = (int) ((Math.random() * Difference) + Min);
			int Random2 = (int) ((Math.random() * Difference) + Min);
			int Random3 = (int) ((Math.random() * Difference) + Min);	
			System.out.println(Random1);
			System.out.println(Random2);
			System.out.println(Random3);
			int Temp_min = Math.min(Random1 , Random2);
			int Final_min = Math.min(Random3 , Temp_min); 
			System.out.println("The minimal generated number was " + Final_min);
			
			
			
		}
	}