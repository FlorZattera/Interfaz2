package subclass;

import superclass.Rodado;

public class Cochecito extends Rodado {

    private boolean esTresEnUno;
    private double peso;
    private boolean esParaguita;
    private boolean estaAbierto;

    public Cochecito(int numeroRuedas, double velocidadMaxima, String color, double costo, boolean esTresEnUno, double peso, boolean esParaguita, boolean estaAbierto) {
        super(numeroRuedas, velocidadMaxima, color, costo);
        this.esTresEnUno = esTresEnUno;
        this.peso = peso;
        this.esParaguita = esParaguita;
        this.estaAbierto = estaAbierto;
    }

    public void abrir() {
        estaAbierto = true;
        System.out.println("Cochecito Abierto");

    }

        public void cerrar() {
            estaAbierto = true;
            System.out.println("Cochecito Cerrado");
    }

    }

