public class Consultorio extends AmbienteClinico{
	private String numero;
	
	public Consultorio(Double espacio, char torre, Integer piso, String numero){
		super(espacio, torre, piso);
		this.numero = numero;
	}
	
	@Override
	public String toString(){
		return "CONSULTORIO:" + numero + " - " + super.toString();
	}
	
	@Override
	public String devolverInformacion(){
		return this.toString();
	}
}