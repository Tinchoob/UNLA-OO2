package datos;

import java.time.LocalDate;
import java.util.Set;

public class TarifaAlta extends Tarifa {
	
	private String tensionContratada;
	private int limite;
	private Set<DetalleAlta> detalles;

	public TarifaAlta() {
	}

	public TarifaAlta(String servicio, LocalDate fechaActualizacion,String tensionContratada, int limite) {
		super(servicio,fechaActualizacion);
		this.tensionContratada = tensionContratada;
		this.limite = limite;
	}

	public String getTensionContratada() {
		return tensionContratada;
	}

	public void setTensionContratada(String tensionContratada) {
		this.tensionContratada = tensionContratada;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public Set<DetalleAlta> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<DetalleAlta> detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "TarifaAlta [tensionContratada=" + tensionContratada + ", limite=" + limite + ", detalles=" + detalles
				+ ", idTarifa=" + idTarifa + ", servicio=" + servicio + "]";
	}

	

}