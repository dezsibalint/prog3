import java.io.IOException;

public abstract class jatekos {
protected asztal Asztal;

public void  lep() throws IOException {
    System.out.println("Kör: "+Asztal.getkor());
    System.out.println("Tét: "+Asztal.getTet());
}


 public void setasztal(asztal A){
    Asztal = A;
    A.addjatekos(this);
}

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objektum azonosito: "+this);
        System.out.println("toString visszatérési értéke:"+this.toString());
    super.finalize();
    }
}