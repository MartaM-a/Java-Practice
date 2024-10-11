import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomCar {
    private List<MarkaSamochodu> marki = Arrays.asList(MarkaSamochodu.values());
    private List<String> kolory = Arrays.asList("Czarny", "Biały", "Czerwony", "Niebieski", "Srebrny");
    private List<Integer> lataProdukcji = Arrays.asList(2005, 2010, 2015, 2020, 2021);
    private List<Boolean> mozliwosciPrzyczepki = Arrays.asList(true, false);
    private List<String> typy = Arrays.asList("Osobowy", "Dostawczy");

    public Samochod randomGenerator() {
        Random random = new Random();
        MarkaSamochodu marka = marki.get(random.nextInt(marki.size()));
        String kolor = kolory.get(random.nextInt(kolory.size()));
        int rokProdukcji = lataProdukcji.get(random.nextInt(lataProdukcji.size()));
        boolean przyczepka = mozliwosciPrzyczepki.get(random.nextInt(mozliwosciPrzyczepki.size()));
        String typ = typy.get(random.nextInt(typy.size()));



        if (typ.equals("Osobowy")) {
            return new Osobowy(marka, kolor, rokProdukcji, przyczepka);
        } else {
            return new Dostawczy(marka, kolor, rokProdukcji, przyczepka);
        }
    }
}