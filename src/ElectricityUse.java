import java.util.Scanner;

public class ElectricityUse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double Watts = 0;
		
		System.out.println("Tool to calculate your computer's lifetime cost. If prompt is given for options, type selection exactly as shown.");
		
		Scanner scantype = new Scanner(System.in);
		System.out.println("Enter the type of computer you want to buy, laptop or desktop.");
		String type = scantype.next();
			
		Scanner scancost = new Scanner(System.in);
		System.out.println("Enter the total cost of the computer you plan to buy.");
		double cost = scancost.nextDouble();
		
		Scanner scanscreen = new Scanner(System.in);
		System.out.println("Enter the size of your screen (round to the nearest inch).");
		int size = scanscreen.nextInt();
		
		Scanner scancpu = new Scanner(System.in);
		System.out.println("What line of cpu does your computer have (i3, i5, i7, AMD 2 core, AMD 4 core, AMD 8 core)?");
		String cpu = scancpu.nextLine();
		
		Scanner scanram = new Scanner(System.in);
		System.out.println("What type of RAM does your computer have (DDR3 or DDR4)?");
		String ram = scanram.next();
		
		Scanner scandrive = new Scanner(System.in);
		System.out.println("Enter the type of storage your computer will use (hard drive or SSD).");
		String drive = scandrive.nextLine();
		
		Scanner scanmouse = new Scanner(System.in);
		System.out.println("Will you be buying a wireless mouse for your computer, yes or no?");
		String mouse = scanmouse.next();
		
		Scanner scanlength = new Scanner(System.in);
		System.out.println("How long do you plan to keep you computer (in years)?");
		double length = scanlength.nextDouble();
		
		if (drive == "hard drive")
			if (type == "laptop")
				Watts = Watts + 1.85;
				
			if (type == "desktop")
				Watts = Watts + 7.75;
			
		if (drive == "SSD")
			Watts = Watts + 1.7;
		
		if (ram == "DDR3")
			Watts = Watts + 3;
		
		if (ram == "DDR4")
			Watts = Watts + 1.5;
		
		
				
				
	}

}
