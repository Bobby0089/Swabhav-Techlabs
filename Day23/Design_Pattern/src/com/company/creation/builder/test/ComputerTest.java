package com.company.creation.builder.test;

import com.company.creation.builder.model.Computer;

public class ComputerTest {
	public static void main(String[] args) {

        Computer gamingPC = new Computer.ComputerBuilder()
                .setCPU("Intel i9")
                .setRAM(32)
                .setStorage(1000)
                .setGPU("Nvidia RTX 4090")
                .setOS("Windows 11")
                .build();

        Computer officePC = new Computer.ComputerBuilder()
                .setGPU("Integrated")
                .setOS("Ubuntu Linux")
                .setCPU("AMD Ryzen 7")
                .build();

        gamingPC.showSpecifications();
        System.out.println("---------------------");
        officePC.showSpecifications();
	}
}
