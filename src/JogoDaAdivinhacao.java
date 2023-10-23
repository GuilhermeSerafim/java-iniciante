import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                Bem vindo ao jogo de adivinhação!
                Qual foi o número gerado?
                """);
        int numeroGerado = new Random().nextInt(100);
        System.out.println(numeroGerado);
        int tentativas = 0;
        while (tentativas < 5) {
            int chute = entrada.nextInt();
            tentativas++;
            if (chute == numeroGerado) {
                System.out.println("Você ganhou");
                break;
            }
            if (tentativas == 5) {
                System.out.println("Você perdeu!");
                break;
            }

        }
    }
}
