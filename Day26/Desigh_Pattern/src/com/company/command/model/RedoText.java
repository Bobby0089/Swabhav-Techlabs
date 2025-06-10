package com.company.command.model;

public class RedoText implements TextCommand{

	private Text text;
	
	
	public RedoText(Text text) {
		super();
		this.text = text;
	}


	@Override
	public void execute() {
		text.redo();
	}

}
