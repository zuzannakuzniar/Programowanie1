package Day1.Zadanie2_1;

public class PianistaImpl extends AbstractMuzyk implements Pianista {

   public PianistaImpl(String name,String surname){
       setImie(name);
       setNazwisko(surname);
   }

    public void przedstawSie(){
        System.out.println(getImie()+getNazwisko());
    }

    @Override
    public void graj() {
        System.out.println("Gra pianino");
    }
}
