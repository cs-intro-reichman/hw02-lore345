public class DamkaBoard {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for (int i = 0; i < a; i++) {
            System.out.println();
            for (int j = 0; j < a; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");

                }
            }
        }
    }
}