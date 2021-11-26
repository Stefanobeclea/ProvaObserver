package it.prova.observerpattern;

public class ObserverMessage implements Observer {

	private String id;
	private String posizione;

	public ObserverMessage(String id) {
		this.id = id;
	}

	@Override
	public void update(Object posizione) {
		System.out.println(id + ": Posizione Ferrari: " + (String) posizione);
		this.posizione = (String) posizione;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosizione() {
		return posizione;
	}

	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	

}
