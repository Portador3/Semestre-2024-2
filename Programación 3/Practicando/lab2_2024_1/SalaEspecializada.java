public class SalaEspecializada extends AmbienteClinico{
	private String nombre;
	private Boolean equipamiento;
	
	public SalaEspecializada(Double espacio, char torre, Integer piso, String nombre, Boolean equipamiento){
		super(espacio, torre, piso);
		this.nombre = nombre;
		this.equipamiento = equipamiento;
	}
	
	@Override
	public String toString(){
		String verdad = "NO";
		if(equipamiento){
			verdad = "SI";
		}
		return "SALA ESPECIALIZADA:" + nombre + " - " + super.toString() + "EQ. IMAGENOLOGIA:" + verdad;
	}
	
	@Override
	public String devolverInformacion(){
		return this.toString();
	}
}