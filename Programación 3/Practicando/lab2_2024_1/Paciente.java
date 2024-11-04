import java.util.ArrayList;
public class Paciente extends Persona{
	private Integer numeroHistoriaClinica;
	private ArrayList<AtencionMedica> atencionesMedicas;
	
	public Paciente(String dni, String nombre, String apellidoPaterno, String apellidoMaterno, Integer numeroHistoriaClinica){
		super(dni, nombre, apellidoPaterno, apellidoMaterno);
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
	
	public void setAtencionesMedicas(ArrayList<AtencionMedica> atencionesMedicas){
		this.atencionesMedicas = atencionesMedicas;
	}
	
	public ArrayList<AtencionMedica> getAtencionesMedicas(){
		return this.atencionesMedicas;
	}
	
	@Override
	public String toString(){
		return "PACIENTE: " + super.toString();
	}
	
	@Override
	public String devolverInformacion(){
		return this.toString();
	}
	
	public void listarCitasMedicasProgramadas(){
		
		for(AtencionMedica atencion : atencionesMedicas){
			System.out.println(atencion.consultarDatos());
		}
		
	}
}