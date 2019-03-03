package Day1.Zadanie2_1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Muzyk pianista = new PianistaImpl("Kot","Gryzka");
        Muzyk skrzypek = new SkrzypekImpl("Chomik","Kawa");
        Muzyk trębacz = new TrebaczImpl("Pies","Bora");

        ArrayList<Muzyk> muzycy = new ArrayList<>();

        muzycy.add(pianista);
        muzycy.add(skrzypek);
        muzycy.add(trębacz);

        Orkiestra orkiestra = new Orkiestra(muzycy);
        orkiestra.przedstawcieSie();
        orkiestra.grac();

    }
}
