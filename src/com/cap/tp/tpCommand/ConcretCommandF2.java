package com.cap.tp.tpCommand;

public class ConcretCommandF2 implements Command {

	
	Receiver rcv;
	
	public ConcretCommandF2() {

	}
	
	public ConcretCommandF2(Receiver receiver) {
		this.rcv=receiver;
	}


	@Override
	public void execute() {
		rcv.f2();
		System.out.println("fonction F2, destruction de Berlin");
	}

}
