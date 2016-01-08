import java.util.Scanner;

public class ElectricityUse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Tool to calculate your computer's lifetime cost.");
		
		Scanner scantype = new Scanner(System.in);
		System.out.println("Enter the type of computer you want to buy, laptop or desktop.");
		String type = scantype.next();
			
		Scanner scancost = new Scanner(System.in);
		System.out.println("Enter the total cost of the computer you plan to buy.");
		double cost = scancost.nextDouble();
		
		Scanner scanscreen = new Scanner(System.in);
		System.out.println("Enter the size of your screen (round to the nearest inch).");
		int size = scanscreen.nextInt();
		
		
	}

}
