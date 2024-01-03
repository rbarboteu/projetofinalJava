import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        String nomeCliente = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.00;
        int escolha = 0;

        String menu = """
                *** Digite sua opção ***
                
                1 - Consulta de saldo
                2 - Transferir valor
                3 - Receber valor
                4- Sair
                
                ******   
                """;


        System.out.println("****************************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo disponível: " + saldo);
        System.out.println("\n****************************");

        while(escolha != 4){
            System.out.println(menu);
            escolha = leitura.nextInt();

            if(escolha == 1){

                System.out.println("Seu saldo: " + saldo);

            } else if (escolha == 2){

                System.out.println("Qual valor deseja transferir?");
                double transferencia = leitura.nextDouble();

                    if (transferencia > saldo) {

                        System.out.println("Digite um valor disponível, seu saldo é de: " + saldo);

                    } else {

                        saldo -= transferencia;
                        System.out.println("Seu novo saldo é: " + saldo);
                    }
            } else if (escolha == 3) {

                    double recebimento = 0;
                    System.out.println("Digite o valor que deseja receber: ");
                    recebimento = leitura.nextDouble();

                    saldo += recebimento;
                    System.out.println("Seu novo saldo é: " + saldo);

            } else {

                System.out.println("Até a próxima!");

            }
        }
    }
}