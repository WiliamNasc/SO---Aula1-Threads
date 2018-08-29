package view;

import controller.ThreadCalc;

public class Principal {

	public static void main(String[] args) {
		
		//Quando uma classe se comporta de mais de uma forma, no caso como classe e thread;
		
		int a = 10;
		int b = 2;
		//int op = 2;
		
		for (int op = 0; op <= 3; op++){
		
		ThreadCalc tCalc = new ThreadCalc(a,b,op);
		tCalc.start();
		
		// start = inicia a thread; run = inicia o metodo run;
		
		}
		
	}

}