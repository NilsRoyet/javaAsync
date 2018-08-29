package com.cap.tp.tpCommand;


/**
 * 
 */
public class ClientTuto {

	public static void main(String[] args) {

		InvokerRemoteControl control = new InvokerRemoteControl();

		ReceiverLight light = new ReceiverLight();

		CommandTuto lightsOn = new ConcretCommandLightOnCommand(light);

		CommandTuto lightsOff = new ConcretCommandLightOffCommand(light);

		// switch on

		control.setCommand(lightsOn);

		control.pressButton();

		// switch off

		control.setCommand(lightsOff);

		control.pressButton();

	}

}