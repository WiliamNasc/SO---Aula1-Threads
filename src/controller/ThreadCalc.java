package controller;

public class ThreadCalc extends Thread {

	private int a;
	private int b;
	private int op;
	
	public ThreadCalc(int a, int b, int op) {
		
		this.a = a;
		this.b = b;
		this.op = op;
		
	}
	
	@Override
	public void run() {
		
		calc();
		
		 
	}
	
	public void calc(){
		int tempo = op * 1000;
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String operacao = "";
		int res = 0;
		
		switch (op) {
		
		case 0:
			
			res = a + b;
			operacao = "+";
			
			break;
			
			case 1:
				
				res = a - b;
				operacao = "-";
				
				break;
				
			case 2:
				
				res = a * b;
				operacao = "*";
				
				break;
				
			case 3:
				
				res = a / b;
				operacao = "/";
				
				break;

		default:
			
			break;
		}
		
		System.out.println(a + " " + operacao + " " + b + " = " + res);
	}
	
	/* Threads 
	 * ela tem que herdar as carcteristicas de thread; 
	 * o main da thred so roda no metodo run eo run não recebe parametro; 
	 * se quiser passar um parametro pra ela so se for pelo construtor da classe.
	*/
	// source - overhild implements metods.
}