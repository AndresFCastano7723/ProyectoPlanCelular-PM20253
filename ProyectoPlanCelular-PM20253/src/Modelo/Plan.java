package Modelo;

public class Plan {
    private String nombre, servicios;
    private int cantMin, cantMegas;
    private double valorPlan;

    public Plan(String nombre, String servicios, int cantMin, int cantMegas, double valorPlan) {
        this.nombre = nombre;
        this.servicios = servicios;
        this.cantMin = cantMin;
        this.cantMegas = cantMegas;
        this.valorPlan = valorPlan;
    }

    public Plan() {
        this.nombre = "";
        this.servicios = "";
        this.cantMin = 0;
        this.cantMegas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public int getCantMin() {
        return cantMin;
    }

    public void setCantMin(int cantMin) {
        this.cantMin = cantMin;
    }

    public int getCantMegas() {
        return cantMegas;
    }

    public void setCantMegas(int cantMegas) {
        this.cantMegas = cantMegas;
    }

    public double getValorPlan() {
        return valorPlan;
    }

    public void setValorPlan(double valorPlan) {
        this.valorPlan = valorPlan;
    }
    
    @Override
    public String toString() {
        return "\nNombre de Plan: " + nombre + "\nCantidad Minutos: " + cantMin + "\nCantidad Megas: " + cantMegas + "\nServicios: " + servicios;
    }
    
    

}
