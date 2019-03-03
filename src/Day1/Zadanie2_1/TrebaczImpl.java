package Day1.Zadanie2_1;

public class TrebaczImpl extends AbstractMuzyk {

    public TrebaczImpl(String name,String surname){
        setImie(name);
        setNazwisko(surname);
    }

    public void przedstawSie() {
        System.out.println(getImie()+getNazwisko());
    }

    @Override
    public void graj() {
        System.out.println("Gra Trąbka ");
    }
}
