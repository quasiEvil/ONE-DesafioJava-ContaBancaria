import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();

        System.out.println("\n----- BEM-VINDO AO BANCO DE FLORENÇA -----");
        System.out.println("Acesso atual: " + data);

        String nome = "Dante Alighieri";
        String tipoConta = "Corrente";
        double saldo = 1321.07;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\n********************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$ " + df.format(saldo));
        System.out.println("********************************");

        Scanner scanner = new Scanner(System.in);

        int operacoes = 0;

        while (operacoes != 4) {
            System.out.println("\n=> OPERAÇÕES DISPONÍVEIS:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.println();
            System.out.print("Digite a opção desejada: ");
            operacoes = scanner.nextInt();

            if (operacoes == 1) {
                System.out.print("\nO saldo atual é: R$ " + df.format(saldo));
                System.out.println();
            } else if (operacoes == 2) {
                System.out.print("Informe o valor a ser recebido: ");
                double valorReceber = scanner.nextDouble();
                saldo += valorReceber;
                System.out.println("\nSaldo atualizado: R$ " + df.format(saldo));
            } else if (operacoes == 3) {
                System.out.println("Informe o valor a ser transferido: ");
                double valorTransferir = scanner.nextDouble();
                if (valorTransferir > saldo) {
                    System.out.println("\nErro: Saldo insuficiente.");
                } else {
                    saldo -= valorTransferir;
                    System.out.println("\nSaldo atualizado: R$ " + df.format(saldo));
                }
            } else if (operacoes == 4) {
                System.out.println("Sessão encerrada. Até logo!");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}