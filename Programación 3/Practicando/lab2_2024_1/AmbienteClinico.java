public class AmbienteClinico implements iConsultable{
	private Double espacio;
	private char torre;
	private Integer piso;
	
	public AmbienteClinico(Double espacio, char torre, Integer piso){
		this.espacio = espacio;
		this.torre = torre;
		this.piso = piso;
	}
	
	@Override
	public String toString(){
		return "TORRE:" + torre + " PISO:" + piso;
	}
	
	@Override
	public String devolverInformacion(){
		return this.toString();
	}
}