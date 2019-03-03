package Day1.Zadanie2_1;

public class SkrzypekImpl extends AbstractMuzyk {

    public SkrzypekImpl(String name,String surname){
        setImie(name);
        setNazwisko(surname);
    }

    public void przedstawSie(){
        System.out.println(getImie()+getNazwisko());
    }

    @Override
    public void graj() {
        System.out.println("Grają skrzypce ");
    }
}
