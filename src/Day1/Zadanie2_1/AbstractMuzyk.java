package Day1.Zadanie2_1;

public abstract class AbstractMuzyk implements Muzyk {
    private String imie;
    private String nazwisko;


    public abstract void przedstawSie();

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
