import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Conta Bancaria:</h1>
 * O simulador de conta bancaria realiza a coleta de dados do cliente e possibilita operações simples como:
 * <p>
 * - Saque;
 * <p>
 * - Depósito;
 * <p>
 * - Saldo;
 * <p>
 * <p>
 * <b>Note:</b> Leia atentamente a documentação das classes e métodos para desfrutar dos recursos oferecidos pelo autor.
 * <p> 
 * <i>Observação: Programa ainda não possibilita realizar multiplas operações bancárias. Aguarde as próximas versões. Obrigado pela compreensão :) </i>
 * 
 * @author Lucas Boelter
 * @version 1.0
 * @since 22/09/2023
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("|-----------------------|");
        System.out.println("|    Seja bem vindo!    |");
        System.out.println("|-----------------------|");
        
        // Efetuando cadastro do cliente
        Cadastro cadastro = new Cadastro();

        System.out.println("Agora vamos criar sua conta.");
        System.out.println("Preencha as informações a seguir");
        
        String nomeCliente = cadastro.coletarNome();
        String agencia = cadastro.coletarAgencia();
        int numeroConta = cadastro.coletarConta();
        double saldo = cadastro.coletarSaldo();
        

        // Apresentação e exibição dos dados coletados
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Olá ".concat(nomeCliente) + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é ".concat(agencia)+ "e sua conta é "+ numeroConta);
        System.out.println("Seu saldo R$ "+ saldo + " já está disponível para saque.");
        System.out.println("----------------------------------------------------------------------");


        //criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // operações
        System.out.println("Deseja realizar alguma operação?");
        System.out.println("1. Saque");
        System.out.println("2. Depósito");
        System.out.println("3. Saldo");
        System.out.println("0. Sair");

        String opcao = scanner.next();

        if (opcao.equals("1")) {
            Operacoes operacao = new Operacoes();
            saldo = operacao.sacar(saldo);  
            System.out.println("Programa sendo finalizado...");        
        }
        
        else if (opcao.equals("2")) {
            Operacoes operacao = new Operacoes();
            saldo = operacao.depositar(saldo);
            System.out.println("Programa sendo finalizado...");          
        }

        else if (opcao.equals("3")) {
            System.out.println("----------------------------");
            System.out.println("Seu saldo é: R$ " + saldo);
            System.out.println("----------------------------");
            System.out.println("Programa sendo finalizado...");
        }
        
        else if (opcao.equals("0")) {
            System.out.println("Operação encerrada pelo usuário.");
        }
        
        else{
            System.out.println("Opção inválida!");
            System.out.println("Programa sendo finalizado...");
        }

        System.out.println("Obrigado pela confiança!");
        
    } 
}
