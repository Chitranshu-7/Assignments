import java.util.Scanner;

public class Prob_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mark[] = new String[20];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            String res = str1 + str2;
            mark[i] = res;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(mark[i]);
        }

    }
}
