import java.util.Locale;
import java.util.Scanner;

/**
 * <h1>Classe Operações:</h1>
 * Esta classe é responsável pelos saques e depósitos realizados pelo usuário.
 * <p>
 * <b>Métodos:</b>
 * <p>
 * - Sacar 
 * <p>
 * - Depositar 
 */
public class Operacoes {

    //criando objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    /**
     * <b>Sacar da Conta:</b>
     * <p>
     * Este método recebe o saldo atual do cliente, coleta o valor que o cliente deseja sacar e verifica se o cliente possui o valor disponível.
     * Caso o valor de saque esteja disponível, o saldo é atualizado e informado ao cliente.
     * @param saldo
     * @return double novoSaldo
     */
    public double sacar(double saldo){
        System.out.println("Quanto deseja sacar?");
        System.out.print("R$ ");
        double valorDesejado = scanner.nextDouble();

        if (valorDesejado <= saldo){
            double novoSaldo = saldo - valorDesejado;
            System.out.println("------------------------------");
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu saldo agora é: R$ "+novoSaldo);
            System.out.println("------------------------------");
            return novoSaldo;
        }
        
        else{
            System.out.println("------------------------------");
            System.out.println("Valor inválido!");
            System.out.println("Seu saldo permanece: R$ "+saldo);
            System.out.println("------------------------------");
            return saldo;
        }
    }

    /**
     * <b>Depositar na Conta:</b>
     * <p>
     * Este método recebe o saldo atual do cliente, coleta o valor que o cliente deseja depositar e verifica se o valor de depósito é válido.
     * Caso o valor de depósito seja válido, o saldo é atualizado e informado ao cliente.
     * @param saldo
     * @return double novoSaldo
     */
    public double depositar(double saldo){
        System.out.println("Quanto deseja depositar?");
        System.out.print("R$ ");
        double valorDesejado = scanner.nextDouble();
        
        if (valorDesejado > 0){
            double novoSaldo = saldo + valorDesejado;
            System.out.println("------------------------------");
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("Seu saldo agora é: R$ "+novoSaldo);
            System.out.println("------------------------------");
            return novoSaldo;
        }
        
        else{
            System.out.println("------------------------------");
            System.out.println("Valor inválido!");
            System.out.println("Seu saldo permanece: R$ "+saldo);
            System.out.println("------------------------------");
            return saldo;
        }
    }
}
