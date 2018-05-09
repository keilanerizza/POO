package solid.lsp;

public class Carro extends Veiculo {

	Marcha atualMarcha = getMarcha();
	@Override
	public void mudaMarcha(Marcha mudarMarcha) {
		if (deFrente(mudarMarcha) || deRe(mudarMarcha)) {
			stop();
		}
		
		mudaMarcha(mudarMarcha);
	}
	
	public boolean deFrente(Marcha mudarMarcha) {
		if(getMarcha().equals(Marcha.D) && mudarMarcha.equals(Marcha.R)) {
			return true;
		}
		return false;
	}
	
	public boolean deRe(Marcha mudarMarcha) {
		if(getMarcha().equals(Marcha.R) && mudarMarcha.equals(Marcha.D)) {
			return true;
		}
		return false;
	}
	
}
