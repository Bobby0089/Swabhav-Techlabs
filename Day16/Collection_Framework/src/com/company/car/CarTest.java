package com.company.car;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CarTest {

	public static void main(String[] args) {
		// using Scanner for user input
		Scanner sc = new Scanner(System.in);
		
		LinkedHashMap<String, Car> cars = new LinkedHashMap<String, Car>();
		
		start(sc,cars);
		
		sc.close();
	}

	private static void displayMenu()
	{
		// TODO Auto-generated method stub
		System.out.println("What to want to do : ");
		System.out.println("1.Park a new car");
		System.out.println("2.Remove a Car.");
		System.out.println("3.Find a car by number");
		System.out.println("4.Display all parked cars in order of entry");
		System.out.println("5.Exit");
		System.out.println();
		System.out.println("Enter your choice : ");
		
	}
	
	private static void start(Scanner sc,LinkedHashMap<String, Car> cars)
	{
		while(true)
		{
			System.out.println();
			displayMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1 : parkNewCar(sc,cars);
					 break;
			case 2 :removeCar(cars,sc);
				     break;
			case 3 :findCar(cars,sc);
				     break;
			case 4 :display(cars);
				     break;
			case 5 :System.out.println("Exting....");
			        return;
			default : System.out.println("Invalid choice....");
			}
			
		}
	}

	private static void display(LinkedHashMap<String, Car> cars)
	{
		 if(cars.isEmpty())
		 {
		     System.out.println("No cars found");
		     return;
		 }
		 System.out.println(cars); 
	}

	private static void findCar(LinkedHashMap<String, Car> cars, Scanner sc)
	{
		System.out.println("What is your car number (Enter last four digit): ");
		String number = sc.nextLine();
		String carNumber = "MH 01 CH "+ number;
		String key = null;
		Car value;
		for (Entry<String, Car> entry :cars.entrySet()) 
        {
            key = entry.getKey();
            value = entry.getValue();
 
            if(value.getCarNumber()==carNumber)
            {
             System.out.println(cars.get(key));
             break;
            }
        }
		
		System.out.println("Your car details : " + cars.get(key));
		
	}

	private static void removeCar(LinkedHashMap<String, Car> cars, Scanner sc)
	{
		if(cars.isEmpty())
		{
			System.out.println("No cars found.");
			return;
		}
		System.out.println("Enter carKey : ");
		String uk = sc.next();
		cars.remove(uk);
		System.out.println("Car removed.");
		
	}

	private static void parkNewCar(Scanner sc, LinkedHashMap<String, Car> cars)
	{
		int numbersOfcar  = getPositiveNumber(sc);
		
		for(int i = 0; i < numbersOfcar; i++)
		{
			System.out.println("Enter brand name : ");
			String carKey = sc.nextLine();
			String carNumber = getCarNumber(sc);
		    String ownerName = getOwnerName(sc);
			double time = getEntryTime(sc);
			  
		    Car c = new Car(carNumber,ownerName,time);
			cars.put(carKey, c);
		    System.out.println("car parked.");
			  
		}	
	}

	private static double getEntryTime(Scanner sc)
	{
		double time;
		while(true)
		{
			System.out.println("Enter entry time : ");	
			time = sc.nextDouble();
			sc.nextLine();
			if(time > 0 && time <= 24)
			{
				return time;
			}
			System.out.println("Enter time from 0:00 to 24:00.");
		}
	}

	private static String getOwnerName(Scanner sc)
	{
		System.out.println("Enter car owner name : ");
		String name = sc.nextLine();
		return name;
	}

	private static String getCarNumber(Scanner sc)
	{
		System.out.println("Enter last four Digit of your car number : ");
		String number = sc.nextLine();
		String carNumber = "MH 01 CH "+ number;
		return carNumber;
	}

	private static int getPositiveNumber(Scanner sc)
	{
		int number;
		while(true)
		{
			System.out.println("Enter number of car you want to park : ");
			number = sc.nextInt();
			sc.nextLine();
			if(number > 0 )
			{
				return number;
			}
			System.out.println("invalid user input try again.");
		}
	}

}
