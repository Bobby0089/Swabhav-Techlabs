package com.company.voilation;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

	 private List<Guitar> guitars;

	    public Inventory() {
	        guitars = new ArrayList<>();
	    }

	    public void addGuitar(String serialNumber, double price, String builder, 
	                          String model, String type, String backWood, String topWood) {
	        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
	        guitars.add(guitar);
	    }

	    public Guitar getGuitar(String serialNumber) {
	        for (Guitar guitar : guitars) {
	            if (guitar.getSerialNumber().equals(serialNumber)) {
	                return guitar;
	            }
	        }
	        return null;
	    }

	    public Guitar search(Guitar searchGuitar) {
	        for (Guitar guitar : guitars) {
	            if ((searchGuitar.getBuilder() != null) && 
	                (!searchGuitar.getBuilder().equals("") && 
	                 !searchGuitar.getBuilder().equalsIgnoreCase(guitar.getBuilder()))) {
	                continue;
	            }
	            if ((searchGuitar.getModel() != null) && 
	                (!searchGuitar.getModel().equals("") && 
	                 !searchGuitar.getModel().equalsIgnoreCase(guitar.getModel()))) {
	                continue;
	            }
	            if ((searchGuitar.getType() != null) && 
	                (!searchGuitar.getType().equals("") && 
	                 !searchGuitar.getType().equalsIgnoreCase(guitar.getType()))) {
	                continue;
	            }
	            if ((searchGuitar.getBackWood() != null) && 
	                (!searchGuitar.getBackWood().equals("") && 
	                 !searchGuitar.getBackWood().equalsIgnoreCase(guitar.getBackWood()))) {
	                continue;
	            }
	            if ((searchGuitar.getTopWood() != null) && 
	                (!searchGuitar.getTopWood().equals("") && 
	                 !searchGuitar.getTopWood().equalsIgnoreCase(guitar.getTopWood()))) {
	                continue;
	            }
	            return guitar;
	        }
	        return null;
	    }
}
