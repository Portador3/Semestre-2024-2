import java.util.Date;
public class Teleconsulta extends CitaMedica{
	private Plataforma plataforma;
	private String enlace;
	
	public Teleconsulta(Paciente paciente, Medico medico, Date fechaProgramada, String motivo, Plataforma plataforma, String enlace){
		super(paciente, medico, fechaProgramada, motivo);
		this.plataforma = plataforma;
		this.enlace = enlace;
	}
	
	@Override
	public String consultarDatos(){
		return super.consultarDatos() + "\n" + "PLATAFORMA:" + plataforma.toString() + " - ENLACE:" + enlace + "\n";
	}
}