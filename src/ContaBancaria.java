import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo à sua conta bancária");

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o seu tipo de conta: ");
        String tipoDeConta = entrada.nextLine();

        System.out.println("Digite o valor a ser depositado: ");
        double saldo = entrada.nextDouble();

        String faixaDeOpcoes = """
                1- Consultar saldos
                2- Depositar valor
                3- Transferir valor
                4- Sair
                """;

        int operacoes = 0;

        while (operacoes != 4) {
            System.out.println("***********************");
            System.out.printf("Nome: %s\nTipo conta: %s\nSaldo: R$ %.2f\n", nome, tipoDeConta, saldo);
            System.out.println("***********************");
            System.out.println("Operações:");
            System.out.println(faixaDeOpcoes);
            System.out.print("Digite a opção desejada: ");
            operacoes = entrada.nextInt();

            switch (operacoes) {
                case 1:
                    System.out.println("O saldo atual é: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite quanto irá depositar: ");
                    double valorDepositado = entrada.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Depositado. Saldo atual: " + saldo);
                    break;
                case 3:
                    System.out.print("Digite quanto quer transferir: ");
                    double transferenciaDeSaldo = entrada.nextDouble();
                    if (transferenciaDeSaldo > saldo) {
                        System.out.println("Operação negada");
                    } else {
                        saldo -= transferenciaDeSaldo;
                        System.out.println("Transferência concluída! Saldo disponível: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Fechando conta bancária...");
                    break;
                default:
                    System.out.println("Opção não reconhecida, digite novamente.");
            }
        }

        entrada.close();
    }
}
