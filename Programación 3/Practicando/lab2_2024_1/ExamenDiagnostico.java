import java.util.Date;
public class ExamenDiagnostico extends AtencionMedica{
	private TipoExamen tipoExamen;
	private SalaEspecializada salaEspecializada;
	
	public ExamenDiagnostico(Paciente paciente, Medico medico, Date fechaProgramada, SalaEspecializada salaEspecializada, TipoExamen tipoExamen){
		super(paciente, medico, fechaProgramada);
		this.salaEspecializada = salaEspecializada;
		this.tipoExamen = tipoExamen;
	}
	
	@Override
	public String consultarDatos(){
		return super.consultarDatos() + "\n" + "SALA ESPECIALIZADA:" + salaEspecializada.toString() + "\n" + "TIPO EXAMEN:" + tipoExamen.toString() + "\n";
	}
}