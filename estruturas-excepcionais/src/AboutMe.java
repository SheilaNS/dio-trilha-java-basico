import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    /*
     * Alguns exceptions existentes:
     * 
     * - java.lang.NullPointerException: variável nula
     * - java.lang.ArithmeticException: valor dividido por zero
     * - java.sql.SQLException: erro de interação com o banco de dados
     * - java.io.FileNotFOundException: erro de arquivo não encontrado
     * - java.util.InputMismatchException: tipos incompatíveis
     * 
     * Tratação de erro com try / catch / finally:
     * - try: executa o bloco de código que pode resultar em algum erro
     * - catch: captura o erro resultante do bloco try
     * - finally: executa o bloco de código independente da ocorrência 
     * de um erro ou não, esse bloco é opcional
     */

    public static void main(String[] args) throws Exception {
        try {
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome: ");
            String nome = scan.next();
            
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scan.next();
            
            System.out.println("Digite sua idade: ");
            int idade = scan.nextInt();
            
            System.out.println("Digite sua altura: ");
            double altura = scan.nextDouble();
            
            scan.close();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
