package com.company.command.test;

import com.company.command.model.RedoText;
import com.company.command.model.Text;
import com.company.command.model.TextCommand;
import com.company.command.model.TextEditor;
import com.company.command.model.TextToBold;
import com.company.command.model.TextToItalic;
import com.company.command.model.UndoText;

public class TextCommandTest {

	public static void main(String[] args) {
		Text text = new Text();
		
		TextCommand  bold = new TextToBold(text);
		TextCommand  italic = new TextToItalic(text);
		TextCommand  undo = new UndoText(text);
		TextCommand  redo = new RedoText(text);
		
		TextEditor editor = new TextEditor();
		
		editor.setCommand(bold);
		editor.pressButton();
		
		editor.setCommand(italic);
		editor.pressButton();
		
		editor.setCommand(undo);
		editor.pressButton();
		
		editor.setCommand(redo);
		editor.pressButton();
		
		

	}

}
