package designPattern.singleton;

public class TesteIncremental {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Incremental inc = Incremental.incremental();
			System.out.println(inc);
		}
	}
}
