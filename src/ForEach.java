public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (var x: nums){
            System.out.println("Value of X:" + x);
            sum +=x ;
        }

        System.out.println("Sum: "+ sum);
    }
}
