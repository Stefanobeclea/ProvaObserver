package it.prova.observerpattern;

public class Test {
	public static void main(String[] args) {

		System.out.println("###################INIZIO TEST OBSERVER###############################");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("**FRANCESCO E RICCARDO VANNO A GUARDARE LA FERRARI CHE GAREGGIA**");
		System.out.println("----------------------------------------------------------------------");
		ObservableMessage posizione = new ObservableMessage();

		Observer osservatore1 = new ObserverMessage("Francesco");
		Observer osservatore2 = new ObserverMessage("Riccardo");

		posizione.addObserver(osservatore1);
		posizione.addObserver(osservatore2);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("[TELECRONACA]: FERRARI VIENE SORPASSATA DA MERCEDES!");
		System.out.println("----------------------------------------------------------------------");
		posizione.setPosizione("2^");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("**RICCARDO ARRABBIATO SENE VA**");
		System.out.println("----------------------------------------------------------------------");		
		posizione.removeObserver(osservatore2);
		System.out.println("[TELECRONACA]: FERRARI VIENE SORPASSATA ANCORA DA ALTRE 3 AUTO!");
		System.out.println("----------------------------------------------------------------------");
		posizione.setPosizione("5^");		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("[TELECRONACA]: FERRARI GUADAGNA TERRENO E METTE ALLE STRETTE MERCEDES!");
		System.out.println("----------------------------------------------------------------------");
		posizione.setPosizione("2^");
		System.out.println("----------------------------------------------------------------------");
		
		Observer osservatore3 = new ObserverMessage("Mario");
		Observer osservatore4 = new ObserverMessage("Riccardo");
		
		System.out.println("**RICCARDO TORNA IN TRIBUNA ACCOMPAGNATO DAL SUO AMICO MARIO**");
		System.out.println("----------------------------------------------------------------------");
		
		posizione.addObserver(osservatore3);
		posizione.addObserver(osservatore4);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("[TELECRONACA]: FERRARI NON MOLLA E RESTA A UN PASSO DALLA MERCEDES!");
		System.out.println("----------------------------------------------------------------------");
		posizione.setPosizione("2^");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("[TELECRONACA]: FERRARI SUPERA MERCEDES A UN PASSO DAL TRAGUARDO!");
		System.out.println("----------------------------------------------------------------------");
		posizione.setPosizione("1^");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("###################FINE TEST OBSERVER#################################");

	}
}
