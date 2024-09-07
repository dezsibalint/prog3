public class Nyuszi extends jatekos{

    private String szin;
    public Nyuszi(String szin){this.szin=szin;}

    public String toString(){
        return (szin);
    }

    @Override
    public void lep() {
        System.out.println(this.toString()+"A(z) "+this.Asztal.getkor()+". körnél tartunk");
        if(this.Asztal.getTet()<50) this.Asztal.emel(5);
        else {
            System.out.println("A tét értéke: "+this.Asztal.getTet()+" Húha!");
        }
    }
}
