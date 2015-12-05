package com.siyalsh.rithms;

public class SimpleThreadProgram extends Thread{
	
	public static void main(String [] args){
		
		SimpleThreadProgram stp1 = new SimpleThreadProgram();
		stp1.start();
		
		SimpleThreadProgram stp2 = new SimpleThreadProgram();
		stp2.start();
		
	}
	
	
	public void run(){
		
		System.out.println("This is " + this.currentThread().getName());
	}

}
