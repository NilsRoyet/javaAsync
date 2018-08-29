package com.cap.tp.tpCommand;
//Invoker

public class InvokerRemoteControl {

	private CommandTuto command;

	public void setCommand(CommandTuto command) {

		this.command = command;

	}

	public void pressButton() {

		command.execute();

	}

}