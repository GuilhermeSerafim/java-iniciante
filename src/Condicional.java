public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1980;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Filme de lançamento");
        } else if (anoDeLancamento < 2000) {
            System.out.println("Filme Clássico");
        } else {
            System.out.println("Filme disponível");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Filme não liberado");
        }
    }
}
