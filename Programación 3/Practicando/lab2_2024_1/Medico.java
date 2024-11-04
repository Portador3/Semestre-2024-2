public class Medico extends Persona{
	private String numeroColegiatura;
	private Especialidad especialidad;
	private String numeroRegistroEspecialidad;
	
	public Medico(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, Especialidad especialidad, String numeroColegiatura, String numeroRegistroEspecialidad){
		super(dni, nombre, apellidoPaterno, apellidoMaterno);
		this.numeroColegiatura = numeroColegiatura;
		this.especialidad = especialidad;
		this.numeroRegistroEspecialidad = numeroRegistroEspecialidad;
	}
	
	@Override
	public String toString(){
		return "MEDICO: " + super.toString() + " CMP:" + numeroColegiatura + " ESPECIALIDAD:" + especialidad.toString();
	}
	
	@Override
	public String devolverInformacion(){
		return this.toString();
	}
}