import java.util.Scanner;


// Exercicio da tabuada
public class App {
    public static void main(String[] args) throws Exception {
        Scanner stdin = new Scanner(System.in);
        int n = stdin.nextInt();
        System.out.println("Tabela de multiplicação de" + n );
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "x" + n + "=" + n * i);
        }
    }
}
