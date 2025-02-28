import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeCliente = "Maicon Mesquita";
        String tipoConta = "Corrente";
        double saldoConta = 1000.00;
        Scanner leitor = new Scanner(System.in);

        System.out.printf("""
                *****************************************************
                
                Dados iniciais do cliente:
                
                Nome:               %s
                Tipo da conta:      %s
                Saldo inicial:      %.2f
                
                *****************************************************
                """,nomeCliente, tipoConta, saldoConta);
        int contador = 0;

        while (contador != 1) {
            System.out.println("""
                    Operações
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada:
                    """);

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: " + saldoConta);
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    double deposito = leitor.nextDouble();
                    saldoConta += deposito;
                    System.out.println("Valor depositado com sucesso, novo saldo é: " + saldoConta);
                    break;
                case 3:
                    System.out.println("Qual valor gostaria de transferir?");
                    double valorTransferencia = leitor.nextDouble();
                    saldoConta -= valorTransferencia;
                    System.out.println("Para quem seria a transfêrencia?");
                    String nomeDestino = leitor.next();
                    System.out.printf("""
                            Transfêrencia realizada com sucesso!
                            
                            Transferido para:       %s
                            Valor transferido:      %.2f
                            
                            Seu saldo atual é:      %.2f
                            """, nomeDestino, valorTransferencia, saldoConta);
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso sistema!");
                    contador = 1;
                    break;
                default:
                    System.out.println("Opção escolhida não existe, tente novamente");
                    break;
            }
        }
    }
}
