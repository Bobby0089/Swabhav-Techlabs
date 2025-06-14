package com.company.exceptionHandling;

public class Throws {
	static void validate(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Number must be positive.");
        }
        System.out.println("Valid number: " + number);
    }

    public static void main(String[] args) {
        try {
            validate(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

}
