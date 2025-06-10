package com.company.command.model;

public class TextToBold implements TextCommand{

	private Text text;
	
	
	public TextToBold(Text text) {
		super();
		this.text = text;
	}


	@Override
	public void execute() {
		text.bold();
	}

}
