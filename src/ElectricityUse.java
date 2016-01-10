import java.util.Scanner;
import java.util.Arrays;

public class ElectricityUse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double Watts = 0;
		
		Integer[] screenSize = {15, 17, 19, 20, 21, 22, 24, 30, 32, 37, 42, 50};
		Integer[] wattage    = {15, 18, 20, 24, 26, 30, 40, 50, 55, 60, 80, 100};
		Integer screenWattage = 0;
		
		String[] cpuModel    = {"i3", "i5", "i7", "AMD 2 core", "AMD 4 core", "AMD 8 core"};
		Integer[] cpuWattage = {64, 84, 86, 80, 95, 110};
		Integer cpuWatts = 0;
		
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
		
		for(int eachScreen : screenSize) {
			if(Arrays.asList(screenSize).contains(size))
			screenWattage = wattage[Arrays.asList(screenSize).indexOf(size)];
		}
		
		Watts = Watts + screenWattage; 

		for(String eachCpu : cpuModel) {
			if(Arrays.asList(cpuModel).contains(cpu))
			cpuWatts = cpuWattage[Arrays.asList(cpuModel).indexOf(cpu)];
			
		}
		
		Watts = Watts + cpuWatts;
		
		if (drive.equals("hard drive"))
			if (type.equals("laptop"))
				Watts = Watts + 1.85;
				
			if (type.equals("desktop"))
				Watts = Watts + 7.75;
			
		if (drive.equals("SSD"))
			Watts = Watts + 1.7;
		
		if (ram.equals("DDR3"))
			Watts = Watts + 3;
		
		if (ram.equals("DDR4"))
			Watts = Watts + 1.5;
		
		System.out.println(Watts);
				
	}
		
}
