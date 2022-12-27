import java.util.Scanner;

public class Prob_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int per = ((a + b + c) * 100 / 300);

        System.out.println(per + "%");

    }
}
