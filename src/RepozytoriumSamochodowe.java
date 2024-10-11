import java.util.ArrayList;
import java.util.List;

public class RepozytoriumSamochodowe {


    private List<Samochod> listaOsobowych = new ArrayList<>();
    private List<Samochod> listaDostawczych = new ArrayList<>();
    private RandomCar generator = new RandomCar(); // Obiekt generatora


    public void generujSamochody(int liczbaSamochodow) {
        for (int i = 0; i < liczbaSamochodow; i++) {
            Samochod samochod = generator.randomGenerator();
            dodajSamochod(samochod);
        }
    }


    public void dodajSamochod(Samochod samochod) {
        if (samochod instanceof Osobowy) {
            listaOsobowych.add(samochod);
        } else if (samochod instanceof Dostawczy) {
            listaDostawczych.add(samochod);
        }
    }

    public void napiszDostawcze() {
        System.out.println("Samochody Dostawcze");
        listaDostawczych.stream().forEach(System.out::println);
    }

    public void napiszOsobowe() {
        System.out.println("Samochody Osobowe");
        listaOsobowych.stream().forEach(System.out::println);
    }

//
//    public void napiszOsoboweFiaty() {
//        System.out.println("Samochody osobowe marki FIAT");
//        listaOsobowych.stream();

}