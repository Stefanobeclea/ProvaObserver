package it.prova.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableMessage {

	private String posizione;
	private List<Observer> listaDiChiOsservaLaGara = new ArrayList<>();

	public void addObserver(Observer tiposo) {
		tiposo.update(this.posizione);
		this.listaDiChiOsservaLaGara.add(tiposo);
	}

	public void removeObserver(Observer tiposo) {
		this.listaDiChiOsservaLaGara.remove(tiposo);
	}

	public ObservableMessage() {
		this.posizione = "1^";
	}

	public void setPosizione(String nuovaPosizione) {
		this.posizione = nuovaPosizione;
		for (Observer observer : this.listaDiChiOsservaLaGara) {
			observer.update(this.posizione);
		}
	}

	public List<Observer> getListaAutoDaCorsa() {
		return listaDiChiOsservaLaGara;
	}

	public void setListaAutoDaCorsa(List<Observer> listaAutoDaCorsa) {
		this.listaDiChiOsservaLaGara = listaAutoDaCorsa;
	}

	public String getPosizione() {
		return posizione;
	}
	
	

}