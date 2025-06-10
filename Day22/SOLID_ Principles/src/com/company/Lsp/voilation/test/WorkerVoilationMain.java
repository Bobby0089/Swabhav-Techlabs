package com.company.Lsp.voilation.test;

import com.company.Lsp.voilation.model.IWorker;
import com.company.Lsp.voilation.model.Labour;
import com.company.Lsp.voilation.model.Robot;

public class WorkerVoilationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour = new Labour();
		labour.startWork();
		labour.StopWork();
		labour.eat();
		labour.drink();
		
		IWorker robot = new Robot();
		robot.startWork();
		robot.eat();
		robot.drink();
		robot.StopWork();

	}

}
