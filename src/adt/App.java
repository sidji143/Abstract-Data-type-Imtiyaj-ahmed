package adt;

public class App {

	public static void main(String[] args) {
			
		Counter c = new Counter("siddharth");
		
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		
		c.getCurrentValue();
		
		System.out.println(c.getCurrentValue());
		
		System.out.println(c.toString());
	}

}
