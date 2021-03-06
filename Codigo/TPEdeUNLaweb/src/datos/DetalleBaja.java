package datos;

public class DetalleBaja {
	private long idDetalleBaja;
	private String detalleConcepto;
	private String unidad;
	private int desde;
	private int hasta;
	private double valor;
	private TarifaBaja tarifa;
	
	
	public DetalleBaja() {}
	
	


	public DetalleBaja(String detalleConcepto, String unidad, int desde, int hasta, double valor,TarifaBaja tarifa) {
		this.detalleConcepto = detalleConcepto;
		this.unidad = unidad;
		this.desde = desde;
		this.hasta = hasta;
		this.valor = valor;
		this.setTarifa(tarifa);
	}




	public long getIdDetalleBaja() {
		return idDetalleBaja;
	}




	protected void setIdDetalleBaja(long idDetalleBaja) {
		this.idDetalleBaja = idDetalleBaja;
	}




	public String getDetalleConcepto() {
		return detalleConcepto;
	}


	protected void setDetalleConcepto(String detalleConcepto) {
		this.detalleConcepto = detalleConcepto;
	}


	public String getUnidad() {
		return unidad;
	}


	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}


	public int getDesde() {
		return desde;
	}


	public void setDesde(int desde) {
		this.desde = desde;
	}


	public int getHasta() {
		return hasta;
	}


	public void setHasta(int hasta) {
		this.hasta = hasta;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}




	public TarifaBaja getTarifa() {
		return tarifa;
	}




	public void setTarifa(TarifaBaja tarifa) {
		this.tarifa = tarifa;
	}




	@Override
	public String toString() {
		return "DetalleBaja [idDetalleBaja=" + idDetalleBaja + ", detalleConcepto=" + detalleConcepto + ", unidad="
				+ unidad + ", desde=" + desde + ", hasta=" + hasta + ", valor=" + valor + "]";
	}
	
	
	
	

}
