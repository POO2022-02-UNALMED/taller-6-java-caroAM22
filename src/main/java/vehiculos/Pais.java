package vehiculos;

public class Pais {
	private String nombre;

	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		return Fabricante.fabricaMayorVentas().getPais();
	}
}
