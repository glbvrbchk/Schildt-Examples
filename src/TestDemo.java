public class TestDemo {
    public static void main(String[] args) {
        Test one = new Test(1);
        Test two = new Test(2);

        Test.swap(one,two);

        System.out.println("one: "+one.a);
    }
}
