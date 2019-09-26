package petnaestidomaci;

public class Pravougaonik {
	private double a;
	private double b;
	private String ime;
	private double o, p;

	public Pravougaonik(double a, double b, String ime) {
		this.a = a;
		this.b = b;
		this.ime = ime;
	}

	public Pravougaonik(double a, String ime) {
		this.a = a;
		this.ime = ime;
	}

	public double getA() {
		return a;

	}

	public double getB() {
		return b;

	}

	public String getIme() {
		return ime;

	}

	public double getObim(double a, double b) {
		double o;
		o = 2 * a + 2 * b;
		return o;

	}

	public double getPovrsina(double a, double b) {
		double p;
		p = a * b;
		return p;
	}

	public String ispisiPravougaonik() {
		String ispis = "";
		ispis = ispis + "\nPravougaonik: " + ime;
		ispis = ispis + "\nDuzina prve stranice: " + a;
		ispis = ispis + "\nDuzina druge stranice: " + b;
		ispis = ispis + "\nPovrsina pravougaonik: " + getPovrsina(a, b);
		ispis = ispis + "\nObim pravougaonik: " + getObim(a, b);
		return ispis;

	}

}
