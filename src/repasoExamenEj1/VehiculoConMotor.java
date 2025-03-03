package repasoExamenEj1;

abstract class VehiculoConMotor implements Vehiculo {

	
static String marca;

int peso;

public VehiculoConMotor(String marca, int peso) {
	this.marca = marca;
	this.peso = peso;
}




public static String getMarca() {
	return marca;
}




public void setMarca(String marca) {
	this.marca = marca;
}




public int getPeso() {
	return peso;
}




public void setPeso(int peso) {
	this.peso = peso;
}




@Override
public String Mostrar() {
	return "VehiculoConMotor [marca=" + marca + ", peso=" + peso + "]";
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
