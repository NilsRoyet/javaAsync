package com.cap.tp.tpCommand;


/**
 * 
 */
public class ConcretCommandLightOnCommand implements CommandTuto {

	ReceiverLight light;

	public ConcretCommandLightOnCommand(ReceiverLight light) {
		this.light = light;
	}

	public void execute() {
		light.switchOn();
		System.out.println("SwitchOn");
	}

}