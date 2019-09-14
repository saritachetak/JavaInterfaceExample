package academy.learningPrograming;

public class MyMain {
    public static void main(String[] args) {

        Example e1=new Example();
        e1.setName("cow ");
        e1.getNumberOfLegs();

        e1.getNumberOfLegs(2);
        e1.setNumberOfLegs(4);

        System.out.println("**************************************");

        Example1 e2=new Example1();
        e2.method3();
    }
}
