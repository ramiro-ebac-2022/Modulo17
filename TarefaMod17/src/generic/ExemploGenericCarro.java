package generic;

import java.util.ArrayList;
import java.util.List;

import generic.carro.Carro;
import generic.carro.Fiat;
import generic.carro.Ford;
import generic.carro.Honda;

public class ExemploGenericCarro {
    public static void main(String[] args) {
        
        List<Carro> carros = new ArrayList<>();
        
        Fiat car1 = new Fiat("Fiat","Toro");
        carros.add(car1);

        Ford car2 = new Ford("Ford", "Fusion");
        carros.add(car2);

        Honda car3 = new Honda("Honda", "Civic");
        carros.add(car3);

        imprimirCarros(carros);
    }

    private static void imprimirCarros(List<Carro> carros) {
        for (Carro carro: carros) {
            System.out.println(carro);
            carro.imprimirCarro();
        }
    }
}
