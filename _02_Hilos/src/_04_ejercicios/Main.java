package _04_ejercicios;

public class Main {
	public static void main(String[] args) {
		Cola cola = new Cola();


		Productor p1 = new Productor(cola);
		Productor p2 = new Productor(cola);
		Productor p3 = new Productor(cola);
		
		Consumidor c1 = new Consumidor(cola);
		Consumidor c2 = new Consumidor(cola);

		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();

	}
}
