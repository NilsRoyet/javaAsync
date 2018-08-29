package com.cap.tp.tpCommand;

public class ConcretCommand implements Command {

	
	Receiver rcv;
	
	public ConcretCommand() {

	}
	
	public ConcretCommand(Receiver receiver) {
		this.rcv=receiver;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
