package biblioteca;

public class Biblioteca {
	 String nombre, horario;
	 int numero_prestamos = 0;
	 Material[] material = new Material[10];
	 Persona[] usuario = new Persona[10];
	 Prestamo[] prestamo = new Prestamo[10];
	 
	 public Biblioteca() {
		 nombre = "Cineteca";
		 horario = "LUNES A VIERNES de 8 a 15";
		 material[0] = new Libro(023, 87544,"David Ficher","Interestelar", "disponible", "Avon");
		 usuario[0] = new Alumno(5502755, "Juan Perez", "juanperez@gmail.com", "0974521382", 25477);
		 
		 prestar_material(material[0], usuario[0]);
		 ver_material_prestados();
	 }
	 
	 private void prestar_material(Material material2, Persona persona) {
		 prestamo[numero_prestamos] = new Prestamo("24/05/24",0, material2, persona);
		 numero_prestamos++;
		
	}

	private void ver_material_prestados() {
		 System.out.println(prestamo[0].toString());
	 }
	 
	 public static void main(String[] args) {
		new Biblioteca();
		 
	 }
}
