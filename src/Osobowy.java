public class Osobowy implements Samochod {
    private MarkaSamochodu marka;
    private String kolor;
    private int rokProdukcji;
    private boolean mozliwoscPrzyczepki;

    public Osobowy(MarkaSamochodu marka, String kolor, int rokProdukcji, boolean mozliwoscPrzyczepki) {
        this.marka = marka;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.mozliwoscPrzyczepki = mozliwoscPrzyczepki;
    }

    @Override
    public void uruchomSilnik() {
        System.out.println("Uruchamiam silnik samochodu osobowego.");
    }

    @Override
    public void zatrzymajSilnik() {
        System.out.println("Zatrzymuję silnik samochodu osobowego.");
    }

    @Override
    public void sprawdzIloscPaliwa() {
        System.out.println("Sprawdzam ilość paliwa w samochodzie osobowym.");
    }


    public MarkaSamochodu getMarka() {
        return marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public boolean isMozliwoscPrzyczepki() {
        return mozliwoscPrzyczepki;
    }
    public void setMozliwoscPrzyczepki(boolean mozliwoscPrzyczepki) {
        this.mozliwoscPrzyczepki = mozliwoscPrzyczepki;
    }
    @Override
    public String toString() {
        return "Osobowy{" +
                "marka=" + marka +
                ", kolor='" + kolor + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", mozliwoscPrzyczepki=" + mozliwoscPrzyczepki +
                '}';
    }


}