package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.FacturaDao;
import datos.Factura;
import datos.LecturaBajaDemanda;

public class FacturaABM {
	private static FacturaABM instancia = null;

	protected FacturaABM() {
	}

	public static FacturaABM getInstancia() {
		if (instancia == null) {
			instancia = new FacturaABM();
		}
		return instancia;
	}

	

	public int agregar(Factura objeto) {
		return FacturaDao.getInstancia().agregar(objeto);
	}

	public void actualizar(Factura objeto) {
		FacturaDao.getInstancia().actualizar(objeto);
	}

	public void eliminar(Factura objeto) {
		FacturaDao.getInstancia().eliminar(objeto);
	}

	public Factura traerFactura(long idFactura) {
		return FacturaDao.getInstancia().traerFactura(idFactura);
	}
	
	
	public Factura traerFacturaPeriodoAnterior(LocalDate fecha) {
		return FacturaDao.getInstancia().traerFacturaPeriodoAnterior(fecha);
	}
	
	public double traerConsumoAnteriorBajaDemanda(LocalDate fecha) {
		return ((LecturaBajaDemanda) traerFacturaPeriodoAnterior(fecha).getLectura()).getConsumo();
	}
	
	public List<Factura> traerFacturasEntreFechas(LocalDate fechaDesde,LocalDate fechaHasta){
		return FacturaDao.getInstancia().traerFacturasEntreFechas(fechaDesde, fechaHasta);
	}
	
	
	
	
	
	
}
