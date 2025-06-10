package com.company.creation.singleton.test;

import com.company.creation.singleton.model.DataBaseConnection;

public class DataBaseConnectionTest {

	public static void main(String[] args) {
		
		DataBaseConnection dataBase = DataBaseConnection.getInstance();
		dataBase.connect();
		dataBase.disConnect();
		
		DataBaseConnection dataBase1 = DataBaseConnection.getInstance();
		
		System.out.println(dataBase.hashCode() == dataBase1.hashCode());
	}

}
