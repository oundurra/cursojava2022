
public class Principal {

	public static void main(String[] args) {
		System.out.println("Crear aplicacion");
		Aplicacion aplicacion = new Aplicacion("UBER", 3);
		System.out.println("La aplicacion en uso es " + aplicacion.getNombre() + " versión " + Integer.toString(aplicacion.getVersion()));
		System.out.println("----------------");
		
		System.out.println("Crear usuario");
		Usuario usuario = new Usuario(1, "Peluca", 99, "Santiago");
		System.out.println("Se creo el usuario " + usuario.getNombre());
		System.out.println("----------------");
		
		System.out.println("Crear conductor");
		Conductor conductor = new Conductor(2, "Tobi", 1234, new Vehiculo("Renault", "Symbol", "Gris", 2020, "AXBX20"));
		System.out.println("Se creo el conductor " + conductor.getNombre());
		System.out.println("----------------");
		
		/*
		 * Tambien se puede hacer:
		 * Vehiculo vehiculo = new Vehiculo("Renault", "Symbol", "Gris", 2020, "AXBX20");
		 * Conductor conductor2 = new Conductor(2, "Tobi", 1234, vehiculo);
		*/
		
		// Aplicacion aplicacion, Conductor conductor, Usuario usuario, String direccionOrigen, String direccionDestino, String hora
		System.out.println("Crear viaje");
		Viaje viaje = new Viaje(aplicacion, conductor, usuario, "Alameda 1340", "Vitacura 987", "20:24");
		System.out.println("Se creo el viaje desde " + viaje.getDireccionOrigen() + " hasta " + viaje.getDireccionDestino());
		System.out.println("El conductor es " + viaje.getConductor().getNombre() + " y el usuario es " + viaje.getUsuario().getNombre());
		System.out.println("----------------");
		
		viaje.setTiempo(43);
		viaje.setTarifa(7000);
		System.out.println("El viaje termino, tuvo una duración de " + Integer.toString(viaje.getTiempo()) + " minutos y un valor de " + Integer.toString(viaje.getTarifa()) + " pesos.");
		
	}


	
}
