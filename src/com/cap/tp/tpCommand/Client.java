package com.cap.tp.tpCommand;

public class Client {
	public static void main(String[] args) {

		Invoker control = new Invoker();

		Receiver rcv = new Receiver();

		Command lightsOn = new ConcretCommand(rcv);

		Command lightsOff = new ConcretCommand(rcv);

		// switch on 

		control.setCommand(lightsOn);

		control.doAction();

		// switch off

		control.setCommand(lightsOff);

		control.doAction();

	}
}
