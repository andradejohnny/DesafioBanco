import java.util.Scanner;

/*
***********************************************************
Dados inicias do cliente:

Nome = Johnny Andrade
Tipo conta = Corrente
Saldo inicial: 2500 reais

***********************************************************
*/
public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Johnny Andrade";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        System.out.println("***********************************************************");
        System.out.println("\nDados inicias do cliente:\n");
        System.out.println("Nome = " + nomeCliente);
        System.out.println("Tipo conta = " + tipoConta);
        System.out.println("Saldo inicial: " + saldo +" reais\n");
        System.out.println("***********************************************************");

        String menu = """
                ***********************************************************
                -> Menu de Opções:
                
                1 - Consultar Saldo;
                2 - Transferir Valor;
                3 - Depósitar na Conta;
                4 - Sair;
                
                ***********************************************************
                
                """
                ;
        Scanner leitura = new Scanner(System.in);
        while (opcao != 4)
        {

            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("\nSaldo: " + saldo +" reais\n");
            }
            else if (opcao == 2)
            {
                System.out.println("Valor de Transferência: ");
                double transferencia = leitura.nextDouble();
                if(transferencia <= saldo)
                {
                    saldo-=transferencia;
                    System.out.println("\nTransferência Concluida! \n\nSaldo restante: " + saldo +" reais\n");
                }
                else
                {
                    System.out.println("\nTranferência Inválida! Saldo Insuficiente! \n");
                }

            }
            else if (opcao == 3) {
                System.out.println("Valor de Depósito: ");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("Depósito Concluido! \n\nSaldo atualizado:" + saldo +" reais\n");

            }
            else if (opcao<1 || opcao>4)
            {
                System.out.println("\n\nOpção inválida! Tente Novamente!\n\n");
            }
        }
    }
}