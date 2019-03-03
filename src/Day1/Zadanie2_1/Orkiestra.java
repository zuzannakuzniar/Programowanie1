package Day1.Zadanie2_1;

import java.util.ArrayList;

public class Orkiestra  {

    ArrayList<Muzyk> muzycy = new ArrayList<>();

    public void dodaj(Muzyk muzyk){
        muzycy.add(muzyk);
    }

    public Orkiestra(ArrayList<Muzyk> muzycy){
         this.muzycy = muzycy;

    }

    public void grac() {
        for (Muzyk muzyk :
                muzycy) {
            muzyk.graj();
        }
    }

    public void przedstawcieSie() {
        for (Muzyk muzyk :
                muzycy) {
//            muzyk.przedstawSie();
        }
    }
}
