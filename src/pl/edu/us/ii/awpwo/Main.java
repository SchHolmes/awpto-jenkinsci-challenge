package pl.edu.us.ii.awpwo;

/**
 * @author Student
 *
 */
public class Main {
	/**
	 * Main point of app.
	 * @param args
	 */
	public static void main(String[] args) {
		Pies maksiu = new Pies();
		Pies rocky = new Pitbull();
		Pies cezar = new Bulterier();
		maksiu.szczekaj();
		rocky.szczekaj();
		cezar.szczekaj(); // Mala zmiana
	}
}
