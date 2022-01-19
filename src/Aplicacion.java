
public class Aplicacion {
	private String nombre;
	private int version;
	
	Aplicacion(String nombre, int version) {
		this.nombre = nombre;
		this.version = version;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
}
