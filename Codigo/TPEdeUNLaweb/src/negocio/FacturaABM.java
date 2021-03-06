package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.FacturaDao;
import datos.Factura;
import datos.LecturaAltaDemanda;
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
	
	
	public Factura traerFacturaPeriodoAnterior(LocalDate fecha, int nroMedidor) {
		return FacturaDao.getInstancia().traerFacturaPeriodoAnterior(fecha, nroMedidor);
	}
	
	public double traerConsumoAnteriorBajaDemanda(LocalDate fecha, int nroMedidor) {
		return ((LecturaBajaDemanda) traerFacturaPeriodoAnterior(fecha,nroMedidor).getLectura()).getConsumo();
	}
	
	public double traerConsumoHorasPicoAnteriorAltaDemanda(LocalDate fecha,int nroMedidor) {
		return ((LecturaAltaDemanda) traerFacturaPeriodoAnterior(fecha, nroMedidor).getLectura()).getConsumoHorasPico();
	}

	public double traerConsumoHorasValleAnteriorAltaDemanda(LocalDate fecha, int nroMedidor) {
		return ((LecturaAltaDemanda) traerFacturaPeriodoAnterior(fecha, nroMedidor).getLectura()).getConsumoHorasValle();
	}

	public double traerConsumoHorasRestoAnteriorAltaDemanda(LocalDate fecha, int nroMedidor) {
		return ((LecturaAltaDemanda) traerFacturaPeriodoAnterior(fecha, nroMedidor).getLectura()).getConsumoHorasResto();
	}

	public Factura traerFacturaYLstItem(long idFactura) {
		return FacturaDao.getInstancia().traerFacturaYLstItem(idFactura);
	}
	
	public Factura traerUltimaFactura() {
		return FacturaDao.getInstancia().traerUltimaFactura();
	}
	
	
	//REPORTE 8 TRAER FACTURAS ENTRE FECHAS
	public List<Factura> traerFacturasEntreFechas(LocalDate fechaDesde,LocalDate fechaHasta){
		return FacturaDao.getInstancia().traerFacturasEntreFechas(fechaDesde, fechaHasta);
	}
	
	
	
	
	
	
}
