
public class Usuario extends Persona {
	private int telefono;
	private String ciudad;

	Usuario(int rut, String nombre, int telefono, String ciudad) {
		super(rut, nombre);
		this.telefono = telefono;
		this.ciudad = ciudad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
