import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

    //criando objeto scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    /**
     * Este método coleta nome e sobrenome, concatena os valores e retona o nome completo do cliente
     * @return string nomeCliente
     */
    public String coletarNome (){
        System.out.print("Primeiro nome: ");
        String nome = scanner.next();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.next();

        String nomeCliente = nome + " " + sobrenome;
        return nomeCliente;     
    }
    
    /**
     * Este método coleta e retona a agência do cliente
     * @return string agência
     */    
    public String coletarAgencia (){
        
                
        System.out.println("Agência (Ex.: 000-0)");
        System.out.print("> ");
        String agencia = scanner.next();

        return agencia;

    }

    /**
     * Este método coleta e retona o número da conta do cliente
     * @return int número da conta
     */
    public int coletarConta (){

        System.out.println("Número da conta: (Apenas números)");
        System.out.print("> ");
        int numeroConta = scanner.nextInt();

        return numeroConta;

    }

    /**
     * Este método coleta e retona o saldo do cliente
     * @return double saldo
     */
    public double coletarSaldo (){
        System.out.println("Seu saldo: (Ex.:  R$ 12.00)");
        System.out.print("R$ ");
        double saldo = scanner.nextDouble();

        return saldo;

    }
}
