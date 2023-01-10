import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        for (int i = 1; i < n; i++) {
            for(int x = 1; x < i; x++) {
                System.out.print(i);
            }
            System.out.println(i);
        }
    }
}
