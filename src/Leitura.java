import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o filme ");
        //Se digitarmos com "." não vai funcionar por que estamos no padrão pt-br, logo o Scanner espera que seja ","
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
