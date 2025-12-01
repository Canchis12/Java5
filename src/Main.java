import ClasificacionMascotas.MascotaFacturacion;
import ClasificacionMascotas.Parqueadero;
import ClasificacionMascotas.TiendaRopa;
import SistemaFacturacion.FacturacionSupermercado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FacturacionSupermercado facturacionSuper = new FacturacionSupermercado();
        facturacionSuper.facturacion();

        MascotaFacturacion mascotafac = new MascotaFacturacion();
        mascotafac.veterinaria();

        Parqueadero parq = new Parqueadero();
        parq.parqueadero();

        TiendaRopa tnropa = new TiendaRopa();
        tnropa.ropa();
    }
}