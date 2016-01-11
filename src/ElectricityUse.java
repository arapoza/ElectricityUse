import java.util.Scanner;
import java.util.Arrays;

public class ElectricityUse
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//variables we used
		double Watts = 0;
		double batteryCost = 0;
		double kWh = 0;
		double totalCost = 0;
		double monthlyPrice = 0;
		//screen size
		Integer[] screenSize = {15, 17, 19, 20, 21, 22, 24, 30, 32, 37, 42, 50};
		Integer[] wattage    = {15, 18, 20, 24, 26, 30, 40, 50, 55, 60, 80, 100};
		Integer screenWattage = 0;
		//cpu
		String[] cpuModel    = {"i3", "i5", "i7", "AMD 2 core", "AMD 4 core", "AMD 8 core"};
		Integer[] cpuWattage = {64, 84, 86, 80, 95, 110};
		Integer cpuWatts = 0;
		//cents per kWh per month based on residence in the US
		String[] region = {"New England", "Middle Atlantic", "Pacific Contiguous", "Pacific Noncontiguous", "South Atlantic", "Mountain"};
		double[] price  = {18.37, 16.31, 13.47, 25.07, 11.94, 11.91};
		
		System.out.println("Tool to calculate your computer's lifetime cost. If prompt is given for options, type selection exactly as shown.");
		// taking user input to assign them to the variables 
		Scanner scantype = new Scanner(System.in);
		System.out.println("Enter the type of computer you want to buy, laptop or desktop.");
		String type = scantype.next();
		scantype.close();
		
		Scanner scancost = new Scanner(System.in);
		System.out.println("Enter the total cost of the computer you plan to buy.");
		double cost = scancost.nextDouble();
		scancost.close();
		
		Scanner scanscreen = new Scanner(System.in);
		System.out.println("Enter the size of your screen (round to the nearest inch).");
		int size = scanscreen.nextInt();
		scanscreen.close();
		
		Scanner scancpu = new Scanner(System.in);
		System.out.println("What line of cpu does your computer have (i3, i5, i7, AMD 2 core, AMD 4 core, AMD 8 core)?");
		String cpu = scancpu.nextLine();
		scancpu.close();
		
		Scanner scanram = new Scanner(System.in);
		System.out.println("What type of RAM does your computer have (DDR3 or DDR4)?");
		String ram = scanram.next();
		scanram.close();
		
		Scanner scandrive = new Scanner(System.in);
		System.out.println("Enter the type of storage your computer will use (hard drive or SSD).");
		String drive = scandrive.nextLine();
		scandrive.close();
		
		Scanner scanmouse = new Scanner(System.in);
		System.out.println("Will you be buying a wireless mouse for your computer, yes or no?");
		String mouse = scanmouse.next();
		scanmouse.close();
		
		Scanner scanlength = new Scanner(System.in);
		System.out.println("How long do you plan to keep you computer (in years)?");
		double length = scanlength.nextDouble();
		scanlength.close();
		
		Scanner scanlong = new Scanner(System.in);
		System.out.println("How many hours per day do you expect to leave your computer on?");
		double howLong = scanscreen.nextDouble();
		scanlong.close();
		
		Scanner scanRegion = new Scanner(System.in);
		System.out.println("What region of the US do you live in (New England, Middle Atlantic, Pacific Contiguous, Pacific Noncontiguous, South Atlantic, Mountain?");
		String regionInput = scanRegion.nextLine();
		scanRegion.close();
		
		//We have two separate lists: the first for screen size and the second for energy usage. The for loop searches for the user input in the first list, gets the index of the this element, then returns the element at this index of the second list.
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
		
		//calculate watts based on user inputs
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
		
		//formula for battery cost
		if (mouse.equals("yes"))
			batteryCost = length * 3 *.5;
		
		for(String eachRegion : region) {
			if(Arrays.asList(region).contains(regionInput))
			monthlyPrice = price[Arrays.asList(region).indexOf(regionInput)];
		
	}
		
		kWh = (Watts * howLong * 365) / 1000;
		//formula for the total cost
		totalCost =  cost + ((kWh * monthlyPrice) / 100) + batteryCost;
		//rounding total cost to two decimal places
		totalCost = Math.round((totalCost * 1000d) / 1000d); 
		
		System.out.println("The total cost for your computer is " + totalCost);
				
	}
		
}
