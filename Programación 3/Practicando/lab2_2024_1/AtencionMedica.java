import java.util.Date;
import java.text.SimpleDateFormat;
public class AtencionMedica{
	private Paciente paciente;
	private Medico medico;
	protected Date fechaCreacion;
	protected Date fechaProgramada;
	private Integer identificador;
	private static Integer identificadorVariable = 0;
	private EstadoDeAtencion estado;
	
	public AtencionMedica(Paciente paciente, Medico medico, Date fechaProgramada){
		this.identificador = this.identificadorVariable++;
		this.paciente = paciente;
		this.medico = medico;
		this.fechaCreacion = new Date();
		this.fechaProgramada = fechaProgramada;
		this.estado = EstadoDeAtencion.PROGRAMADA;
	}
	
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		return "ID:" + identificador + " - CREACION:"+ sdf.format(fechaCreacion) + " - ATENCION:" + sdf.format(fechaProgramada) + " - " + estado.toString() + "\n"+ medico.devolverInformacion() + "\n" + paciente.devolverInformacion();
	}
}