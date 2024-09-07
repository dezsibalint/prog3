import javax.swing.*;
import java.io.IOException;
import java.util.Random;

class NincsJatekos extends Exception {
    NincsJatekos(String msg){ super(msg); }
}

public class asztal {

    private jatekos [] jatekosok=new jatekos[10];
    private double tet;
    private int kor;
    private double goal;

    public void ujjatek(){
        kor=0;
        tet=0;
        goal=new Random().nextDouble(100);

    }
    public int getkor(){return kor;}

    public double getTet(){return tet;}

    public void addjatekos(jatekos j){
        int i=0;
        while(i<11){
            if(jatekosok[i]==null){jatekosok[i]=j;
            return;}
            else{i++;}
        }
    }

    public void emel(double d){
        tet+=d;
    }

    public void kor() throws NincsJatekos, IOException {

       if(jatekosok[0]==null){ throw new NincsJatekos("NincsJatekos");}

        kor++;
        if(tet>goal){
            System.out.println("Vége a játéknak");
        }

        int i=0;
        while (jatekosok[i]!=null){
            jatekosok[i].lep();
            if(tet<goal) {i++; System.out.println("A tét aktuális értéke: "+tet);}
            if(tet>goal&&tet<goal*1.1){
                System.out.println("Vége a játéknak. A győztes: "+jatekosok[i]);
                break;

            }if(tet>goal*1.1) {
                System.out.println("Vége a játéknak");
            break;
            }

        }

    }

}
