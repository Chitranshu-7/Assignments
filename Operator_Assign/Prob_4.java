import java.util.Scanner;

public class Prob_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int mark[] = new int[4];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            mark[i] = a + b;

        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            System.out.println(mark[j]);

        }
    }
}
