package biblioteca;

public class RevistaCientifica extends Material {
	private String aria_cientifica;

	public RevistaCientifica(int codigo, int anio, String autor, String titulo, String estado, String aria_cientifica) {
		super(codigo, anio, autor, titulo, estado);
		this.aria_cientifica = aria_cientifica;
		
	}

	private String get_aria_cientifica() {
		return aria_cientifica;
	}

	private void set_aria_cientifica(String aria_cientifica) {
		this.aria_cientifica = aria_cientifica;
	}

	@Override
	public String toString() {
		return "RevistaCientifica [aria_cientifica=" + aria_cientifica + ", get_aria_cientifica()="
				+ get_aria_cientifica() + ", get_codigo()=" + get_codigo() + ", get_anio()=" + get_anio()
				+ ", get_autor()=" + get_autor() + ", get_titulo()=" + get_titulo() + ", get_estado()=" + get_estado()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
	
	
}
