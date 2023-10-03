import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Electrodomestic> Electrodomestics = new ArrayList<>();
        
        Rentadora lavadora = new Rentadora(null);
        lavadora.nom = "Lavadora 105";
        lavadora.color = "Amarillo";
        lavadora.preu = 1004;
        lavadora.marca = "LaHora";
        lavadora.eficiencia = "MuyBien";
        lavadora.revolucions = "Muchas";
        lavadora.soroll = "Pokito";
        Electrodomestics.add(lavadora);

        Rentadora lavadora2 = (Rentadora) lavadora.clone();
        Electrodomestics.add(lavadora2);

        Nevera nevera = new Nevera(null);
        nevera.nom = "Neverita ProMax";
        nevera.color = "Naranja Aguoso Fosforescente";
        nevera.preu = 87551;
        nevera.marca = "Estrellitas Refrigerantes";
        nevera.eficiencia = "UHF";
        nevera.frigories = 888;
        nevera.soroll = "DeMicaEnMica";
        Electrodomestics.add(nevera);

        Nevera nevera2 = (Nevera) nevera.clone();
        Electrodomestics.add(nevera2);

        Forn horno = new Forn(null);
        horno.nom = "ElMejorHornoQueVerasNunca";
        horno.color = "Verde cesped";
        horno.preu = 33267;
        horno.marca = "MuyBuena";
        horno.eficiencia = "Altisima";
        horno.temperatura = 3;
        horno.autoneteja = "NoTine";

        Forn horno2 = (Forn) horno.clone();
        Electrodomestics.add(horno2);

        List<Electrodomestic> ElectrodomesticsClone = new ArrayList<>();
        for (Electrodomestic inst : Electrodomestics) {
            ElectrodomesticsClone.add(inst.clone());
        }

        System.out.println("Comparar la mateixa llista:");
        for (int i = 0; i < Electrodomestics.size(); i++) {
            compare(i, Electrodomestics.get(i), ElectrodomesticsClone.get(i));
        }

        System.out.println("\nComparar amb la llista clonada:");
        for (int i = 0; i < Electrodomestics.size(); i++) {
            compare(i, Electrodomestics.get(i), ElectrodomesticsClone.get(i));
        }

        System.out.println("\nComparar amb la llista clonada però invertida:");
        for (int i = 0; i < Electrodomestics.size(); i++) {
            compare(i, Electrodomestics.get(i), ElectrodomesticsClone.get(Electrodomestics.size() - i - 1));
        }

    }
    static void compare (int i, Electrodomestic a, Electrodomestic b) {
        if (a == b) {
            System.out.println(i + ": Els electrodomestics son el mateix objecte");
        } else {
            System.out.print(i + ": Els electrodomestics son objectes diferents - ");
            if (a.equals(b)) {
                System.out.println(i + ": Els electrodomestics son idèntics");
            } else {
                System.out.println(i + ": Els electrodomestics NO son identics");
            }
        }
    }
}
