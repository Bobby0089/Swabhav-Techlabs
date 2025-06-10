package com.company.test;

import java.util.Scanner;

import com.company.vehicle.Bike;
import com.company.vehicle.Car;
import com.company.vehicle.IVehicle;

public class IVehicleTest {

	public static void main(String[] args) {
		// scanner class to take input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vehicle you want to add : ");
		int numberOfVehicle = sc.nextInt();
		
		IVehicle[] vehicle = new IVehicle[numberOfVehicle];
		String choice;
		
		for(int i = 0; i < numberOfVehicle; i++)
		{
			while(true)
			{
				boolean flag = false;
				System.out.println("Enter details for vehicle "+(i+1)+" : ");
				System.out.println("Enter Vehicle Type car or bike (C/B):");
				choice = sc.next();
				
				if(choice.equalsIgnoreCase("C"))
				{
					String fuelType;
					
					while(true)
					{
						boolean check = false;
						System.out.print("Enter fuel type for Car Diesel or Petrol (D/P): ");
						fuelType = sc.next();
						
						if(fuelType.equalsIgnoreCase("D"))
						{
							 vehicle[i] = new Car("Diesel");
							 check = true;
							 flag = true;
						}
						else if(fuelType.equalsIgnoreCase("P"))
						{
							 vehicle[i] = new Car("Petrol");
							 check = true;
							 flag = true;
						}
						else
						{
							 System.out.print("Invalid choice, try again "); 
						}
						if(check)
						{
							break;
						}
						
					}
				}
				else if(choice.equalsIgnoreCase("B"))
				{
					vehicle[i] = new Bike();
					flag = true;
				}
				else
				{
					 System.out.print("Invalid choice, try again "); 
				}
				if(flag)
				{
					break;
				}
			}
			
		}
		
		  // Display vehicle details
        System.out.println("\nVehicle Details:");
        for (IVehicle v : vehicle) {
            v.start();
            System.out.println("Fuel Type: " + v.fuelType());
            v.stop();
            System.out.println("--------------------");
        }
		
        sc.close();
	}

}






