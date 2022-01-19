public class Viaje {
	// Atributos
	private String direccionOrigen;
	private String direccionDestino;
	private String hora;
	private int tarifa;
	private int tiempo;
	private Conductor conductor;
	private Usuario usuario;
	private Aplicacion aplicacion;
	
	public Viaje(Aplicacion aplicacion, Conductor conductor, Usuario usuario, String direccionOrigen, String direccionDestino, String hora) {
		this.aplicacion = aplicacion;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.hora = hora;
		this.conductor = conductor;
		this.usuario = usuario;
	}

	public String getDireccionOrigen() {
		return direccionOrigen;
	}

	public void setDireccionOrigen(String direccionOrigen) {
		this.direccionOrigen = direccionOrigen;
	}

	public String getDireccionDestino() {
		return direccionDestino;
	}

	public void setDireccionDestino(String direccionDestino) {
		this.direccionDestino = direccionDestino;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getTarifa() {
		return tarifa;
	}

	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Aplicacion getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(Aplicacion aplicacion) {
		this.aplicacion = aplicacion;
	}
	
	
}
