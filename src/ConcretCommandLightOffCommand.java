//Concrete Command

public class ConcretCommandLightOffCommand implements Command {

	// reference to the light

	ReceiverLight light;

	public ConcretCommandLightOffCommand(ReceiverLight light) {

		this.light = light;

	}

	public void execute() {

		light.switchOff();

	}

}