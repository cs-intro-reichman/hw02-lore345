public class Perfect {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int sum = 1;
        String perfect = a + " is a perfect number since " + a + " = 1";

        for (int i = 2; i <= a / 2 ; i++) {
            if (a % i == 0) {
                perfect = perfect + " + " + i;
                sum = sum + i;
            }
        }
        if (sum == a) {
            System.out.println(perfect);
        } else {
            System.out.println(a + " is not a perfect number");
        }
    }
}
