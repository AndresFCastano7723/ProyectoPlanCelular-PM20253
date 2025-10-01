
package Control;

import Modelo.Factura;
import Vista.CajasMensaje;

public class Controlador {
    public Factura e;
    public CajasMensaje in;

    public Controlador() {
        this.e = new Factura();
        this.in = new CajasMensaje();
    }
    
    public void iniciar(){
        boolean band = true;
        do {
            in.mostrar("Registrar datos de cliente");
            e.getCliente().setNombre(in.leerTexto("Ingrese el nombre del cliente:"));
            e.getCliente().setId(in.leerTexto("Ingrese ID del cliente:"));
            e.getCliente().setNumLinea(in.leerTexto("Ingrese numero de linea:"));
            in.mostrar("Ingresar datos de plan");
            e.getPlan().setNombre(in.leerTexto("Ingrese nombre del plan:"));
            e.getPlan().setCantMin(in.leerEntero("Cantidad de minutos:"));
            e.getPlan().setCantMegas(in.leerEntero("Cantidad de megas:"));
            e.getPlan().setServicios(in.leerTexto("Servicios:"));
            e.getPlan().setValorPlan(in.leerDecimal("Ingrese valor del plan [" + e.getPlan().getNombre() + "]"));
            in.mostrar("[Datos de factura]" +  e.toString());
            band = in.confirmar("¿Desea registrar una nueva factura?");
            
        } while (band == true);
    }
    
}
