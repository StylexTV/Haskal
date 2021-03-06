package de.stylextv.haskal.command.commands;

import de.stylextv.haskal.command.Command;
import de.stylextv.haskal.command.InputController;
import de.stylextv.haskal.command.message.Message;

public class QuitCommand extends Command {
	
	public QuitCommand() {
		super("quit");
	}
	
	@Override
	public void execute(Message m) {
		InputController.stop();
	}
	
}
