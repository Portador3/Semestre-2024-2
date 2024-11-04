import java.util.Date;
public class CitaMedica extends AtencionMedica{
	private String motivo;
	
	public CitaMedica(Paciente paciente, Medico medico, Date fechaProgramada, String motivo){
		super(paciente, medico, fechaProgramada);
		this.motivo = motivo;
	}
	
	@Override
	public String consultarDatos(){
		return super.consultarDatos();
	}
}