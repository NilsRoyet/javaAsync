package com.cap.tp.tpCommand;


/**
 * 
 */
public class Invoker {

	private Command command;

	public void setCommand(Command command) {

		this.command = command;

	}

	public void doAction() {

		command.execute();

	}

}