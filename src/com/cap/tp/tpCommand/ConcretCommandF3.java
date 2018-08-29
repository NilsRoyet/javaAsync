package com.cap.tp.tpCommand;

public class ConcretCommandF3 implements Command {

	
	Receiver rcv;
	
	public ConcretCommandF3() {

	}
	
	public ConcretCommandF3(Receiver receiver) {
		this.rcv=receiver;
	}


	@Override
	public void execute() {
		rcv.f3();
		System.out.println("fonction F3, destruction de Rome");
	}

}
