public class Test {
    int a;

    Test(int i){a=i;}

    static void swap(Test a,Test b){
        int temp;

        temp = a.a;
        a.a=b.a;
        b.a=temp;
    }
}
