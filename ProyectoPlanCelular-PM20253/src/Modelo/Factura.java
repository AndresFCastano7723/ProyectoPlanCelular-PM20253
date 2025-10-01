package Modelo;

public class Factura {
    private String nroFac;
    private Cliente cliente;
    private Fecha fecha;
    private Plan plan;

    public Factura(String nroFac, Cliente cliente, Fecha fecha, Plan plan) {
        this.nroFac = nroFac;
        this.cliente = cliente;
        this.fecha = fecha;
        this.plan = plan;
    }

    public Factura() {
        int id = (int) (Math.random()*999)+100;
        this.nroFac = "302-"+id;
        this.cliente = new Cliente();
        this.fecha = new Fecha();
        this.plan = new Plan();
    }

    public String getNroFac() {
        return nroFac;
    }

    public void setNroFac(String nroFac) {
        this.nroFac = nroFac;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    
    public double iva(){
        return plan.getValorPlan() * 0.16;
    }
    
    public double valorPago(){
        return plan.getValorPlan() + iva();
    }

    @Override
    public String toString() {
        return "\nNro de Factura: " + getNroFac() + "\nCliente:" + getCliente().toString() + "\nInformación de plan:" + getPlan().toString() + "\n\nValor de IVA (16%):\t" + iva() + "\nValor neto:\n" + getPlan().getValorPlan() + "\nValor total:\n" + valorPago();
    }
    
}
