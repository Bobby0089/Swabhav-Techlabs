package com.company.creation.abstractfactory.test;

import java.util.Scanner;

import com.company.creation.abstractfactory.model.AMDFactory;
import com.company.creation.abstractfactory.model.AMDGpu;
import com.company.creation.abstractfactory.model.IAbstractFactorty;
import com.company.creation.abstractfactory.model.ICPU;
import com.company.creation.abstractfactory.model.IGPU;
import com.company.creation.abstractfactory.model.IntelFactory;
import com.company.creation.abstractfactory.model.NvidiaGpu;

public class ComputerManufacture {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select CPU manufacturer (Intel / AMD): ");
        String cpuChoice = scanner.nextLine().trim().toLowerCase();

        System.out.println("Select GPU manufacturer (Nvidia / AMD): ");
        String gpuChoice = scanner.nextLine().trim().toLowerCase();

        IAbstractFactorty factory;

        if (cpuChoice.equals("intel")) {
            factory = new IntelFactory();
        } else if (cpuChoice.equals("amd")) {
            factory = new AMDFactory();
        } else {
            System.out.println("Invalid CPU selection.");
            scanner.close();
            return;
        }

        ICPU selectedCPU = factory.createCpu();
        IGPU selectedGPU;

        // Manually selecting GPU since IntelFactory always returns Nvidia GPU
        if (gpuChoice.equals("nvidia")) {
            selectedGPU = new NvidiaGpu();
        } else if (gpuChoice.equals("amd")) {
            selectedGPU = new AMDGpu();
        } else {
            System.out.println("Invalid GPU selection.");
            scanner.close();
            return;
        }

        System.out.println("\nManufacturing System Output:");
        selectedCPU.assembled();
        selectedGPU.assembled();

        scanner.close();
    }


}
