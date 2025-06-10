package com.company.command.model;

public class TextToItalic implements TextCommand{

	private Text text;
	
	
	public TextToItalic(Text text) {
		super();
		this.text = text;
	}


	@Override
	public void execute() {
		text.italic();
	}

}

