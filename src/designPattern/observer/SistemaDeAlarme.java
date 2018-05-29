package designPattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaDeAlarme {
	private List<Observador> observadores = new ArrayList<>();
	
	void addObservador(Observador novoObservador) {
		observadores.add(novoObservador);
	}
	
	void removeObservador(Observador novoObservador) {
		observadores.remove(novoObservador);
	}
	
	void monitoraTemperatura() {
		
		Random random = new Random(); 
		int x = random.nextInt(60);
		System.out.println(x);
		
		if(x > 30) {
			dispararAlarme();
		} else {
			System.out.println("Tudo na paz !!!");
		}
	}

	private void dispararAlarme() {
		for(Observador obs : observadores) {
			obs.alarmeDisparado();
		}
	}
	
	public static void main(String[] args) {
		
		Delegacia del = new Delegacia();
		Seguradora seg = new Seguradora();
		SistemaDeAlarme sist = new SistemaDeAlarme();
		
		sist.addObservador(del);
		sist.addObservador(seg);
		
		
		sist.monitoraTemperatura();
		
	}
}
