public class Persona implements iConsultable{
	protected String dni;
	protected String nombre;
	protected String apellidoPaterno;
	protected String apellidoMaterno;
	
	public Persona(String dni, String nombre, String apellidoPaterno, String apellidoMaterno){
		this.dni = dni;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}
	
	@Override
	public String toString(){
		return dni + " - " + nombre + " " + apellidoPaterno + " " + apellidoMaterno;
	}
	
	@Override
	public String devolverInformacion(){
		return this.toString();
	}
}