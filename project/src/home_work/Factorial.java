package home_work;

public class Factorial {
	private int num;
	private int fact;
	
	public Factorial() {
		fact = 1;
		num = 0;
	}
	
	public int findFact(int num) {
		int i = 0;
		
		for(i=num;i>0;i--) {
			fact = fact*i;
		}
		
		return fact;
	}
	
	public void display() {
		System.out.println("Factorial result:"+this.fact);
	}

}
