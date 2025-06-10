package com.company.Lsp.correction.test;

import com.company.Lsp.correction.model.IWorkable;
import com.company.Lsp.correction.model.IWorker;
import com.company.Lsp.correction.model.Loader;
import com.company.Lsp.correction.model.Robot;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker loader = new Loader();
		loader.start();
		loader.eat();
		loader.rest();
		loader.stop();
		
		IWorkable robot = new Robot();
		robot.start();
		robot.stop();
		
	}

}
