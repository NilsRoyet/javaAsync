package com.cap.tp.tpCommand;

import java.util.ArrayList;
import java.util.List;


public class MesRunnables extends Thread implements Runnable{
	private List<Command> runnables = new ArrayList<Command>();
	
	
	
	public void addRunnable(Command runnable) {
		runnables.add(runnable);
	}
	
	public MesRunnables() {
		super();
	}
	
	@Override
	public void run() {
		System.out.println("Thread utilisé : " +Thread.currentThread().getName());
		for (Command runnable : runnables) {
			runnable.execute();
		}
	}
}
