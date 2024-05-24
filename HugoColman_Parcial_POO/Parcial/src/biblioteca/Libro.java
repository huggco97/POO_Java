package biblioteca;

public class Libro extends Material {
	private String editorial;
	
	public Libro (int codigo, int anio, String autor, String titulo, String estado, String editorial) {
		super(codigo, anio, autor, titulo, estado);
		this.editorial = editorial;
	}

	private String get_editorial() {
		return editorial;
	}

	private void set_editorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [editorial=" + editorial + ", get_editorial()=" + get_editorial() + ", get_codigo()="
				+ get_codigo() + ", get_anio()=" + get_anio() + ", get_autor()=" + get_anio() + ", get_titulo()="
				+ get_titulo() + ", get_estado()=" + get_estado() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	

	
	
}
