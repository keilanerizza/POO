package aula0603.ex5;

public class EquipamentoSonoro extends Equipamento {
	
	private int volume;
	private boolean stereo;
	
	public void mono() {
		stereo = false;
	}
	public void stereo() {
		stereo = true;
	}
	public void liga() {
		super.liga();
		volume = 5;
	}

	
}
