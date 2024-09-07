public class Kezdo extends jatekos{
private String nev;
public Kezdo(String nev){this.nev=nev;}
    public String toString(){
    return nev;
    }

    @Override
    public void lep() {
        System.out.println(this.toString()+" A(z) "+this.Asztal.getkor()+ "körnél járunk");
        if(this.Asztal.getkor()%2!=0){
            this.Asztal.emel(1);
        }

    }
}
