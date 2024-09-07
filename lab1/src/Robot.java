public class Robot extends jatekos {
    private static int azonosito=0;
    private int id;

    public Robot(){id=azonosito; azonosito++;}
    @Override
    public String toString() {
        return ("Robot"+azonosito+" ");
    }

    @Override
    public void lep() {
       System.out.println( this.toString() +"A(z) "+this.Asztal.getkor()+" körnél járunk.");
    }
}
