package repasoExamenEj1;

public class Coche extends VehiculoConMotor {
	 int nPuertas;
	public Coche(String marca, int peso, int nPuertas) {
		super(marca, peso);

	this.nPuertas=nPuertas;
	
	
	}
	
	
	
	
	
	public int getnPuertas() {
		return nPuertas;
	}





	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}





	@Override
	public String Mostrar() {
		return "Coche [nPuertas=" + nPuertas + ", marca=" + marca + ", peso=" + peso + "]";
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
