import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ember extends jatekos{

    @Override
    public void lep() throws IOException {
        System.out.printf("A tét aktuális értéke: " +this.Asztal.getTet()+" Emelés mértéke:");
        double emeles;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String em= reader.readLine();
        emeles=Double.parseDouble(em);
        this.Asztal.emel(emeles);

    }
}
