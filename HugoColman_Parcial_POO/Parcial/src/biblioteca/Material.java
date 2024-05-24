package biblioteca;

public abstract class Material {
	private int codigo;
	private int anio;
	private String autor;
	private String titulo;
	private String estado;
	
	public Material() {
		
	}
	
	public Material(int codigo, int anio, String autor, String titulo, String estado) {
		this.codigo = codigo;
		this.anio = anio ;
		this.autor = autor;
		this.titulo = titulo;
		this.estado = estado;
	}

	public int get_codigo() {
		return codigo;
	}

	public void set_codigo(int codigo) {
		this.codigo = codigo;
	}

	public int get_anio() {
		return anio;
	}

	public void set_anio(int anio) {
		this.anio = anio;
	}

	public String get_autor() {
		return autor;
	}

	public void set_autor(String autor) {
		this.autor = autor;
	}

	public String get_titulo() {
		return titulo;
	}

	public void set_titulo(String titulo) {
		this.titulo = titulo;
	}

	public String get_estado() {
		return estado;
	}

	public void set_estado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Material [codigo=" + codigo + ", anio=" + anio + ", autor=" + autor + ", titulo=" + titulo + ", estado="
				+ estado + "]";
	}
	
	
}
