public class Main {
    public static void main(String[] args) {
        asztal a1=new asztal();
        Kezdo k1=new Kezdo("Kezdo1");
        Kezdo k2=new Kezdo("Kezdo2");
        Robot r1=new Robot();
        k1.setasztal(a1);
        k2.setasztal(a1);
        r1.setasztal(a1);
        Mester m1=new Mester(12);
        Nyuszi ny1=new Nyuszi("kek");
        m1.setasztal(a1);
        ny1.setasztal(a1);
        Ember e1=new Ember();
        e1.setasztal(a1);
try{
    a1.ujjatek();
    while (a1.getkor()<10){
        a1.kor();
    }
    asztal a2=new asztal();
    a2.ujjatek();
    a2.kor();


        } catch (Exception e){
        System.out.println(e);
}
    System.gc();
    }


}