
public class Conductor extends Persona {
	private int licenciaconducir;
	private Vehiculo vehiculo;
	
	Conductor(int rut, String nombre, int licenciaconducir, Vehiculo vehiculo) {
		super(rut, nombre);
		this.licenciaconducir = licenciaconducir;
		this.vehiculo = vehiculo;
	}

	public int getLicenciaconducir() {
		return licenciaconducir;
	}

	public void setLicenciaconducir(int licenciaconducir) {
		this.licenciaconducir = licenciaconducir;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}



	