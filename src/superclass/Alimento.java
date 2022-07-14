package superclass;

import interfaces.Comprable;

import java.util.Date;

public class Alimento implements Comprable {

    protected String nombre;
    protected Date fechaDeExpiracion;
    protected double costo;

    public Alimento(String nombre, Date fechaDeExpiracion, double costo) {
        this.nombre = nombre;
        this.fechaDeExpiracion = fechaDeExpiracion;
        this.costo = costo;
    }

    @Override
    public String obtenerCaracteristicas() {
        return "Caracteristicas: nombre: " + nombre + ", Fecha de Vencimiento: " + fechaDeExpiracion + " y costo: $" + costo + ".";
    }

    @Override
    public double definirCosto() {
        double precioFinal = costo + (costo * 0.21);
        return precioFinal;
    }

    @Override
    public double calcularPrecioFinal() {
        double precioFinal = costo + (costo * 0.21);
        return precioFinal;
    }

    @Override
    public void comprar() {
        System.out.println("Item comprado.");
    }
}
