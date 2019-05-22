package datos;

import java.util.Set;;

public class TarifaBaja extends Tarifa {

	private Set<DetalleBaja> detalles;

	public TarifaBaja() {}

	public TarifaBaja(String servicio) {
		super(servicio);
	}

	public Set<DetalleBaja> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<DetalleBaja> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "TarifaBaja [idTarifa=" + idTarifa + ", servicio=" + servicio + "]";
	}

	
	
}
