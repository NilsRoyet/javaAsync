package com.cap.tp.tpCommand;

public class Client {
	public static void main(String[] args) {

		Invoker control = new Invoker();

		Receiver rcv = new Receiver();

		Command paris = new ConcretCommandF1(rcv);
		Command berlin = new ConcretCommandF2(rcv);	
		Command rome = new ConcretCommandF3(rcv);

		MesRunnables mr = new MesRunnables();
		
		mr.addRunnable(paris);
		mr.addRunnable(berlin);
		mr.addRunnable(rome);
		
		mr.run();
		
//		control.setCommand(paris);
//		control.doAction();
//
//		control.setCommand(berlin);
//		control.doAction();
//		
//		control.setCommand(rome);
//		control.doAction();

	}
}
