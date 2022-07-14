import clases.Hoja;
import clases.Lienzo;
import clases.Mural;
import clases.TabletaDigital;
import interfaz.Comunicacion;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Comunicacion> mediosDeExpresion = new ArrayList<>();

        mediosDeExpresion.add(new Lienzo(" Lino ", 25));
        mediosDeExpresion.add(new Mural(true, false));
        mediosDeExpresion.add(new Hoja("A4", true));
        mediosDeExpresion.add(new TabletaDigital("Ipad", 2021));

        for (int i = 0; i < mediosDeExpresion.size(); i++) {
            mediosDeExpresion.get(i).comunicarse();
            mediosDeExpresion.get(i).expresarse();
        }
    }
}
