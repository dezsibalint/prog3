
public class jatekos {
protected asztal Asztal;

public void lep(){
    System.out.println("Kör: "+Asztal.getkor());
    System.out.println("Tét: "+Asztal.getTet());
}


 void setasztal(asztal A){
    Asztal = A;
    A.addjatekos(this);
}
}