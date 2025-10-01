package Modelo;
import Modelo.Fecha;
import java.util.Calendar;

public class Cliente{
    private String id, nombre, numLinea;

    public Cliente(String id, String nom, String numLinea) {
        this.id = id;
        this.nombre = nom;
        this.numLinea = numLinea;
    }
    public Cliente() {
        this.id = "";
        this.nombre = "";
        this.numLinea = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumLinea() {
        return numLinea;
    }

    public void setNumLinea(String numLinea) {
        this.numLinea = numLinea;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nNombre: " + nombre + "\nNumero de Linea: " + numLinea;
    }
}