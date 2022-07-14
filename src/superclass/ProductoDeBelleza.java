package superclass;

import interfaces.Comprable;

public class ProductoDeBelleza implements Comprable {

    protected String nombre;
    protected String marca;
    protected double costo;

    public ProductoDeBelleza(String nombre, String marca, double costo) {
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
    }

    @Override
    public String obtenerCaracteristicas() {
        return "Caracteristicas: Nombre: " + nombre + " , Marca : " + marca + " y costo: $" + costo + ".";
    }

    @Override
    public double definirCosto() {
        return costo;
    }

    @Override
    public double calcularPrecioFinal() {
        return costo + (costo * 0.21);
    }

    @Override
    public void comprar() {
        System.out.println("Item comprado.");
    }
}
