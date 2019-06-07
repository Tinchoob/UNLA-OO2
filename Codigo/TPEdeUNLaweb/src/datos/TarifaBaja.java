package datos;

import java.time.LocalDate;
import java.util.Set;;

public class TarifaBaja extends Tarifa {

	private Set<DetalleBaja> detalles;

	public TarifaBaja() {
	}

	public TarifaBaja(String servicio, LocalDate fechaActualizacion) {
		super(servicio, fechaActualizacion);
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
