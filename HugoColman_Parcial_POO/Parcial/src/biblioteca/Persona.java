package biblioteca;

public abstract class Persona {
	private int cedula;
	private String nombre_apellido;
	private String correo;
	private String telefono;
	
	//constructor
	public Persona (){
		
	}
	
	public Persona(int cedula, String nombre_apellido, String correo, String telefono) {
		this.cedula = cedula;
		this.nombre_apellido = nombre_apellido;
		this.correo = correo;
		this.telefono = telefono;
	}
		public int get_cedula(){
			return cedula;
		}
		
		public void set_cedula(int cedula) {
			this.cedula = cedula;
		}
		
		public String get_nombre_apellido() {
			return nombre_apellido;
		}
		
		public void set_nombre_apellido(String nombre_apellido) {
			this.nombre_apellido = nombre_apellido;
		}
		
		public String get_correo() {
			return correo;
		}
		
		public void set_correo(String correo) {
			this.correo = correo;
			
		}
		
		public String get_telefono() {
			return telefono;
		}
	
		public void set_telefono(String telefono) {
			this.telefono = telefono;
		}

		@Override
		public String toString() {
			return "Persona [cedula=" + cedula + ", nombre_apellido=" + nombre_apellido + ", correo=" + correo
					+ ", telefono=" + telefono + "]";
		}
		
		
}
