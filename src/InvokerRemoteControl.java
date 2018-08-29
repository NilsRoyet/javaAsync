//Invoker

public class InvokerRemoteControl {

	private Command command;

	public void setCommand(Command command) {

		this.command = command;

	}

	public void pressButton() {

		command.execute();

	}

}