public class Main {
    public static void main(String[] args) {
        asztal a1=new asztal();
        jatekos j1=new jatekos();
        jatekos j2=new jatekos();
        jatekos j3=new jatekos();
    j1.setasztal(a1);
    j2.setasztal(a1);
    j3.setasztal(a1);
    a1.ujjatek();
    while (a1.getkor()<4){
        a1.kor();
    }



    }
}