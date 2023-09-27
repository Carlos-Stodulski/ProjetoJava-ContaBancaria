import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nomeCliente = "Alan Turing";
        String tipoConta = "Corrente";
        double saldo = 2000.00;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome:                 " + nomeCliente);
        System.out.println("Tipo de conta:        " + tipoConta);
        System.out.println("Saldo inicial:        " + saldo);
        System.out.println("************************************\n");

        int escolheOpc = 0;
        while (escolheOpc != 4) {
            System.out.println("Qual operação você deseja realizar?\n");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depósito");
            System.out.println("3 - Transferência");
            System.out.println("4 - Encerrar sessão");
            System.out.println("Digite o número da opção desejada: \n");
            escolheOpc = leitura.nextInt();

            switch (escolheOpc) {
                case 1:
                    System.out.println("************************");
                    System.out.println(String.format("* Saldo atual: %.2f *", saldo));
                    System.out.println("************************\n");
                    break;

                case 2:
                    System.out.println("Qual o valor de depósito?");
                    double recebeValor = leitura.nextDouble();
                    if (recebeValor <= 0) {
                        System.out.println("******************************************");
                        System.out.println("* OPERAÇÃO CANCELADA: Valor inválido     *");
                        System.out.println("******************************************\n");
                        break;
                    } else {
                        saldo = saldo + recebeValor;
                        System.out.println("********************************");
                        System.out.println("* Valor recebido com sucesso.  *");
                        System.out.println(String.format("* Saldo atual: %.2f         * ", saldo));
                        System.out.println("********************************");
                        break;
                    }

                case 3:
                    System.out.println("Qual o valor de transferência?");
                    double transfValor = leitura.nextDouble();

                    if (saldo < transfValor) {
                        System.out.println("******************************************");
                        System.out.println("* OPERAÇÃO CANCELADA: Saldo insuficiente *");
                        System.out.println("******************************************\n");
                    } else {
                        saldo = saldo - transfValor;
                        System.out.println("****************************************");
                        System.out.println("* Transferência realizado com sucesso. *");
                        System.out.println(String.format("* Saldo atual: %.2f                 *", saldo));
                        System.out.println("****************************************\n");
                    }
                    break;

                case 4:
                    System.out.println("***********************************************");
                    System.out.println(" SESSÃO FINALIZADA");
                    System.out.println(" Obrigado pela preferência.");
                    System.out.println(" Volte sempre! ☺");
                    System.out.println("***********************************************");
                    break;

                default:
                    System.out.println("******************");
                    System.out.println("* OPÇÃO INVÁLIDA *");
                    System.out.println("******************\n");
            }
        }
    }
}
