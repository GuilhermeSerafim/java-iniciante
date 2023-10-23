// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8) / 3;
        System.out.println(media);
        String sinopse;
        //Utilizando text block
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de lançamento: %d
        ------------------
        """.formatted(anoDeLancamento) ;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) media / 2; // casting explícito
        System.out.println(classificacao);

    }
}