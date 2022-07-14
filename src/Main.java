import interfaces.Comprable;
import subclass.Bicicleta;
import subclass.Cochecito;
import superclass.Alimento;
import superclass.ProductoDeBelleza;
import superclass.Rodado;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {

        List<Comprable> comprableList = new ArrayList<>();
        comprableList.add(new Rodado(4, 180, "negro", 4000000));
        comprableList.add(new Cochecito(3, 10, "verde agua", 45000, false, 7.5, false, true));
        comprableList.add(new Bicicleta(2, 65, "rosa", 56000, 5, false));
        comprableList.add(new Alimento("brocoli", new Date(122, 06, 18), 200));
        comprableList.add(new ProductoDeBelleza("esmalte", "Maybelline", 320));

        for (int i = 0; i < comprableList.size(); i++) {
            System.out.println(comprableList.get(i).obtenerCaracteristicas());
            comprableList.get(i).definirCosto();
            comprableList.get(i).calcularPrecioFinal();
            comprableList.get(i).comprar();
        }
    }
}
