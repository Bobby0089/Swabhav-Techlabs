package com.company.command.model;

public class UndoText implements TextCommand{

	private Text text;
	
	
	public UndoText(Text text) {
		super();
		this.text = text;
	}


	@Override
	public void execute() {
		text.undo();
	}

}

