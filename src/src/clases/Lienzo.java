package clases;

import interfaz.Comunicacion;

public class Lienzo implements Comunicacion {

    public String tipoDeMaterial;
    public double tamaño;

    public Lienzo(String tipoDeMaterial, double tamaño) {
        this.tipoDeMaterial = tipoDeMaterial;
        this.tamaño = tamaño;
    }

    @Override
    public void comunicarse() {
        System.out.println(" Estoy pintando unas margaritas de mi jardin con un lienzo de " + tipoDeMaterial + " que mide " + tamaño + " pulgadas ");

    }

    @Override
    public void expresarse() {
        System.out.println(" Estoy exprezando mi alegría ");

    }
}
