package designPattern.singleton;

public class Incremental {
	
	private static Incremental singleton;
	private static int count = 0;
	private int numero;
	
	private Incremental() {
		numero = ++count;
	}
	
	public static Incremental incremental() {
		if(singleton == null) {
			singleton = new Incremental();
		}
		
		return singleton;
	}
	
	public String toString() {
		return "Incremental " + numero;
	}
}
