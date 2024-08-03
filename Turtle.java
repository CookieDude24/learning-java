public class Turtle {
    public static void main(String[] args) {
        VierTurtle t1,t2,t3;

        t1=new VierTurtle();
        t2=new VierTurtle(100,200);
        t3=new VierTurtle(300,400,90);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        t3.move(100);
        System.out.println(t3);
        t3.turnleft();
        System.out.println(t3);
        t3.move(100);
        System.out.println(t3);
    }
}
