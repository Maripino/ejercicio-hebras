public class Hebra2 implements Runnable {
	
	
	private String name;

	public Hebra2 (String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				
			}
			System.out.println(this.getName() + " ==> " + i);
		}		
	}
	
	public static void main(String[] args) {
		int numeroHebras = 50;
		for (int i = 0; i < numeroHebras; i++) {
			new Thread(new Hebra2("Hebra " + i)).start();
		}
		
		System.out.println("Creadas todas las hebras.");
	}
}
