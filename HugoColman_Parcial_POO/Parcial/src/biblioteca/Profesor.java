package biblioteca;

public class Profesor extends Persona{
	private String especialidad ;

	public Profesor(int cedula, String nombre_apellido, String correo, String telefono, String especialidad) {
		super(cedula, nombre_apellido, correo, telefono);
		this.especialidad = especialidad;
	}

	private String get_especialidad() {
		return especialidad;
	}

	private void set_especialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + ", get_especialidad()=" + get_especialidad()
				+ ", get_cedula()=" + get_cedula() + ", get_nombre_apellido()=" + get_nombre_apellido()
				+ ", get_correo()=" + get_correo() + ", get_telefono()=" + get_telefono() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}	
	
}
