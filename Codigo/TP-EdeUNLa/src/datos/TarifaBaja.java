package datos;

import java.util.Set;;

public class TarifaBaja extends Tarifa {

	private Set<DetalleAlta> detalles;

	public TarifaBaja() {
	}

	public TarifaBaja(String servicio) {
		super(servicio);
	}

	public Set<DetalleAlta> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<DetalleAlta> detalles) {
		this.detalles = detalles;
	}

}
