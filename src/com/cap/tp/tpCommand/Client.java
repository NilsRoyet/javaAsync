package com.cap.tp.tpCommand;

public class Client {
	public static void main(String[] args) {

		Invoker control = new Invoker();

		Receiver rcv = new Receiver();

		Command paris = new ConcretCommandF1(rcv);
		Command berlin = new ConcretCommandF2(rcv);	
		Command rome = new ConcretCommandF3(rcv);


		control.setCommand(paris);
		control.doAction();

		control.setCommand(berlin);
		control.doAction();
		
		control.setCommand(rome);
		control.doAction();

	}
}
