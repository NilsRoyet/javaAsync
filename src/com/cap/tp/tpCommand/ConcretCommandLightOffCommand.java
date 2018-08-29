package com.cap.tp.tpCommand;
//Concrete Command

public class ConcretCommandLightOffCommand implements CommandTuto {

	// reference to the light

	ReceiverLight light;

	public ConcretCommandLightOffCommand(ReceiverLight light) {

		this.light = light;

	}

	public void execute() {

		light.switchOff();

	}

}