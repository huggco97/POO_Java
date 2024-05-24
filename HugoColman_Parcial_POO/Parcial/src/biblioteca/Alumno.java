package biblioteca;

public class Alumno extends Persona {
	private int matricula;

	public Alumno(int cedula, String nombre_apellido, String correo, String telefono, int matricula) {
		super(cedula, nombre_apellido, correo, telefono);
		this.matricula = matricula;
		
	}

	private int getMatricula() {
		return matricula;
	}

	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", getMatricula()=" + getMatricula() + ", get_cedula()="
				+ get_cedula() + ", get_nombre_apellido()=" + get_nombre_apellido() + ", get_correo()=" + get_correo()
				+ ", get_telefono()=" + get_telefono() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}


}
