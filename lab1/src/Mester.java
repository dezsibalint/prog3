public class Mester extends jatekos{
    private int fokozat;
    public Mester(int f){
        fokozat=f;
    }
    public String toString(){
        return("Mester, fokozat: "+fokozat);
    }

    @Override
    public void lep() {
        System.out.println("A(z) "+this.Asztal.getkor()+"körnél tartunk. Mester fokozat: "+fokozat);
        this.Asztal.emel((this.Asztal.getTet()/100)*fokozat);
    }
}
