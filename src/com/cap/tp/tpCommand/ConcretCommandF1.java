package com.cap.tp.tpCommand;

public class ConcretCommandF1 implements Command {

	
	Receiver rcv;
	
	public ConcretCommandF1() {

	}
	
	public ConcretCommandF1(Receiver receiver) {
		this.rcv=receiver;
	}


	@Override
	public void execute() {
		rcv.f1();
		System.out.println("fonction F1, destruction de Paris");
		
	}

}
