package repasoExamenEj1;

public class Moto extends VehiculoConMotor {
	String tipoMoto;

	
	public Moto(String marca, int peso,String tipoMoto) {
		super(marca, peso);
		
		this.tipoMoto=tipoMoto;
		
	}


	public String getTipoMoto() {
		return tipoMoto;
	}


	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}


	@Override
	public String Mostrar() {
		return "Moto [tipoMoto=" + tipoMoto + ", marca=" + marca + ", peso=" + peso + "]";
	}


	@Override
	public void arrancar() {
System.out.println("brum brum brum el vehiculo de marca" + marca+" ha arrancado");
	}
	@Override
	public void parar() {
		System.out.println("............... el vehiculo de marca" + marca+" ha parau");
		
	}

	
	
	
	
	
}
