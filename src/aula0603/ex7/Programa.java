package aula0603.ex7;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {

		CartaoWeb[] cw = new CartaoWeb[3];
		
		DiaDosNamorados dn = new DiaDosNamorados("Maria");
		Natal nt = new Natal("João");
		Aniversario an = new Aniversario("José");
		
		cw[0] = dn;
		cw[1] = nt;
		cw[2] = an;
		
		for (CartaoWeb c : cw) {
			
			c.showMessage();
		}
	}

}
