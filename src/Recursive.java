public class Recursive {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("rec");
        System.out.println("fac 3: "+f.factR(3));
        System.out.println("fac 6: "+f.factR(6));

        System.out.println("iter");
        System.out.println("fac 8: "+f.factI(8));
        System.out.println("fac 10: "+f.factI(10));



    }
}
