package biblioteca;

public class Prestamo {
	private String fecha_salida;
	private int fecha_entrega;
	private Material material;
	private Persona prestatario;
	
	
	public Prestamo() {
		
	}
	
	
	public Prestamo(String fecha_salida, int fecha_entrega, Material material, Persona prestatario) {
		this.fecha_salida = fecha_salida;
		this.fecha_entrega = fecha_entrega;
		this.material = material;
		this.prestatario = prestatario;
		
	}


	private String get_fecha_salida() {
		return fecha_salida;
	}


	private void set_fecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}


	private int get_fecha_entrega() {
		return fecha_entrega;
	}


	private void set_fecha_entrega(int fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}


	private Material get_material() {
		return material;
	}


	private void set_material(Material material) {
		this.material = material;
	}


	private Persona get_prestatario() {
		return prestatario;
	}


	private void set_prestatario(Persona prestatario) {
		this.prestatario = prestatario;
	}


	@Override
	public String toString() {
		return "Prestamo [fecha_salida=" + fecha_salida + ", fecha_entrega=" + fecha_entrega + ", material=" + material
				+ ", prestatario=" + prestatario + ", get_fecha_salida()=" + get_fecha_salida()
				+ ", get_fecha_entrega()=" + get_fecha_entrega() + ", get_material()=" + get_material()
				+ ", get_prestatario()=" + get_prestatario() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
