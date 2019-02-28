public class Hebra extends Thread {
	
	
	private static int contador = 0;

	public Hebra(String nombre) {
		super(nombre);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.getName() + " ==> " + i);
			contador++;
			System.out.println(contador);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		int numeroHebras = 10;
		for (int i = 0; i < numeroHebras; i++) {
			Hebra hebra = new Hebra("Hebra " + i);
			hebra.start();
		}
		
		System.out.println("Creadas todas las hebras.");
	}
}