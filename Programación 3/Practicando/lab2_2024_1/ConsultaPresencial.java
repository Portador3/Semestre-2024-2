import java.util.Date;
public class ConsultaPresencial extends CitaMedica{
	private Boolean asistenciaEspecial;
	private Consultorio consultorio;
	
	public ConsultaPresencial(Paciente paciente, Medico medico, Date fechaProgramada, String motivo, Consultorio consultorio, Boolean asistenciaEspecial){
		super(paciente, medico, fechaProgramada, motivo);
		this.consultorio = consultorio;
		this.asistenciaEspecial = asistenciaEspecial;
	}
	
	@Override
	public String consultarDatos(){
		String verdad = new String();
		if (asistenciaEspecial){
			verdad = "SI";
		}
		else{
			verdad = "NO";
		}
		return super.consultarDatos() + "\n" + consultorio.toString() + "\n" + "REQ. ASISTENCIA:" + verdad + "\n";
	}
}